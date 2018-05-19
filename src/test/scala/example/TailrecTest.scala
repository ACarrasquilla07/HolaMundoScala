package example

import org.scalatest.{AsyncWordSpec, Matchers}

class TailrecTest extends AsyncWordSpec with Matchers{
  "FactorialTest" should {
    "" in {
      val resultado = Tailrec.factorial(4)

      resultado should be (24)
    }
  }
}