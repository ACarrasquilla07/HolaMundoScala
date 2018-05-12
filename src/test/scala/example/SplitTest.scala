package example

import org.scalatest.{AsyncWordSpec, Matchers}

class SplitTest extends AsyncWordSpec with Matchers{

  "SplitTest" should {
    "" in {

      val parts = "Andres Julian Carrasquilla Gutierrez".split(" ")

      val resultado = parts(0)

      resultado should be("Andres")
    }
  }

  "SplitTest2" should {
    "" in {
      val vectorNumeros = "0, 1, 2, 3, 4, 5".split(", ")

      val resultado = vectorNumeros(5)

      resultado should be("5")
    }
  }
}
