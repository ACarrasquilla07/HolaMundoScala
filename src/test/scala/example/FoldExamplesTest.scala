package example

import org.scalatest.{AsyncWordSpec, Matchers}

class FoldExamplesTest extends AsyncWordSpec with Matchers {

  "FoldExampleValNone" should{
    "" in{
      val valor1: Option[Int] = Some(9)
      val valor2: Option[Int] = None

      val result1 = valor1.fold(-1)(_ * 3)
      val result2 = valor2.fold(-1)(_ * 3)

      result1 should be(27)
      result2 should be(-1)
    }
  }

  "FoldLeftExampleList" should{
    "" in{
      val inputList: List[Int] = List(1,2,3,4,5)

      val res = inputList.foldLeft(0){(acc, i) => acc + i}

      res should be (15)
    }
  }

  "FoldLeftExampleList2" should{
    "" in{
      val inputList: List[Int] = List(1,2,3,4,5)

      //en el siguiente caso "6" es el valor con el que inicia
      val res = inputList.foldLeft(6){(acc, i) => acc + i}

      res should be (21)
    }
  }

  "FoldLeftExampleList3" should{
    "" in{
      val inputList: List[Int] = List(1,2,3,4)

      val res = inputList.foldLeft(1){(acc, i) => acc * i}

      res should be (24)
    }
  }

  //El foldRight a diferencia del Left compienza por la derecha
  "FoldLeftRestaExampleList" should{
    "" in{
      val inputList: List[Int] = List(1,2,3)

      val res = inputList.foldLeft(20){(acc, i) => acc - i}
      val res2 = inputList.foldRight(20){(i, acc) => acc - i}

      res should be (14)
      res2 should be(14)
    }
  }
}
