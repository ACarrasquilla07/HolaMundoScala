package example

import org.scalatest.{AsyncWordSpec, Matchers}
import example.CombineObj.SemigroupOps._

class CombineTest extends AsyncWordSpec with Matchers {

  "CombineTest" should{
    "" in {
      val dos = 1 combine 1

      dos should be (2)
    }
  }

  "CombineConSomeTest" should{
    "" in {
      val one: Option[Int] = Some(1)
      val none: Option[Int] = None

      //Some(1) combine Some(1)
      val dos = one combine one
      val uno = one combine none
      val unob = none combine one

      val non = none combine none

      dos should be (Some(2))
      uno should be (Some(1))
      unob should be (Some(1))
      non should be (None)
    }
  }
}
