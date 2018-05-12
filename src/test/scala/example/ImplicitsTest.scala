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


  /*
  "EjemploImplicit" should {
    "" in {
      //Vea el uso de los IMPLICIT

      def sum(aInt: Int)(implicit bInt: Int): Int = aInt+bInt
      def sum(a: String)( b: String): String = a+b

      implicit val i: Int = "88"
      implicit def toS: Int => String = _.toString
      implicit def toI: String => Int = java.lang.Integer.valueOf(_)

      //Los implicit buscan un entero y con el toI lo convierte
      //a entero y lo suma
      val totalSum = sum(2)
      // Convierte el 2 en String por medio del def toS
      sum("H")(2)

      1 should be (1)
    }
  }

  */

}
