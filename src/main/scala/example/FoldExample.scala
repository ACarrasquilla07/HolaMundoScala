package example


object FoldExample extends App{
  val valor1: Option[Int] = Some(9)
  val valor2: Option[Int] = None

  val result1 = valor1.fold(-1)(_ * 3)
  val result2 = valor2.fold(-1)(_ * 3)

  println(result1)
  println(result2)
}
