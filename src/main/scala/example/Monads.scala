package example

import scala.util.{Success, Try}

object Monads extends App{

  trait Monad[F[_]] {
    def pure[A]: A => F[A]

    def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]
  }

  object MonadInstances {
    implicit object optMonad extends Monad[Option] {
      override def pure[A]: A => Option[A] = Option.apply
      override def flatMap[A, B](fa: Option[A])
                       (f: A => Option[B]): Option[B] = fa flatMap f
    }

    type either[A] = Either[String, A]

    implicit object eitherMonad extends Monad[either] {
      override def pure[A]: A => either[A] = Right.apply

      override def flatMap[A, B](fa: either[A])(f: A => either[B]): either[B] = fa.flatMap(f)
    }

    implicit object tryMonad extends Monad[Try]{
      override def pure[A]: A => Try[A] = Success.apply
      override def flatMap[A, B](fa: Try[A])
                       (f: A => Try[B]): Try[B] = fa flatMap f
    }

    trait MonadLaws {
      def f[A, F[_]]: A => F[A]
      def g[A, F[_]]: A => F[A]


      def leftIdentify[A, F[_]: Monad](x: A)(f: A => F[A])(m: Monad[F]): Boolean = {
        m.flatMap(m.pure(x))(f) == f(x)
      }

      def rightIdentity[A, F[_]: Monad](x: A)(m: Monad[F]): Boolean = {
        m.flatMap(m.pure(x))(m.pure) == m.pure
      }

      def associativityIdentity[A, F[_]: Monad](x: A)
            (m: Monad[F])(f: A => F[A])(g: A => F[A]): Boolean = {
        val ap = m.pure(x)
        m.flatMap(m.pure(ap))(a => m.flatMap(f(x))(g)) == m.flatMap(m.flatMap(ap)(f))(g)
      }

    }
  }
}
