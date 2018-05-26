package example

import scala.concurrent.Future

object Clase19Mayo2018 extends App{

  trait User
  trait Address
  trait Id

  def getUserById(id: Id): Future[Option[User]] = Future.successful(None)

  def getAddressByUser(us: User): Future[Option[Address]] = Future.failed(new Exception("Error"))

  /*
  def getAddressByUserId(id: Id): Future[Option[Address]] = {
    for {
      user <- FutOpt(getUserById(id))
      address <- FutOpt(getAddressByUser(user))
    } yield address
  }

  case class FutOpt[A](value: Future[Option[A]]) {

    //def map[B](f: A => FutOpt[B]): FutOpt[B] = FutOpt(value.map(op => op.map(f)))

    def flapMap[B](f: A => FutOpt[B]): FutOpt[B] = {
      FutOpt(
         value.flatMap { op =>
          op match {
            case Some(a) => f(a).value
            case None => Future.successful(None)
          }
        }
      )
    }
  }
  */
}
