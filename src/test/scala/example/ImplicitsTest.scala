package example

import org.scalatest.{AsyncWordSpec, Matchers}


class ImplicitsTest extends AsyncWordSpec with Matchers {

  "EjemploFuturoConImplicit" should {
    "" in {
      //Para enviarle un parametro global con Implicit
      def sumaI(a: Int)(implicit b: Int): Int = a+b

      implicit  val s: Int = 98

      val totalSuma = sumaI(2)

      totalSuma should be (100)
    }
  }
}
