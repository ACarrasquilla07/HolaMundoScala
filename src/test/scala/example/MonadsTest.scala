package example

import org.scalatest.{AsyncWordSpec, Matchers}

class MonadsTest extends AsyncWordSpec with Matchers {

  "MonadTest1" should {
    "" in {

      trait Monad[F[_]] {
        def pure[A]: A => F[A]

        def flapMap[A, B]: A => F[B] => F[B]
      }


      1 should be (1)
    }
  }
}
