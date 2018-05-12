package example

object EitherLeftRightExample extends App{
  def divide(x: Int, y: Int): Either[String, Int] = {
    if(y == 0) Left("No es posible dividir por cero")
    else  Right (x / y)
  }
}
