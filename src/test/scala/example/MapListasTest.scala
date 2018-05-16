package example

import org.scalatest.{AsyncWordSpec, Matchers}

class MapListasTest extends AsyncWordSpec with Matchers{

  "MapTest" should {
    "" in {
      val lista = List(1,2,3,4,5)

      val resultado = lista.map(x => x +1) //Realiza la funcion en la lista


      resultado should be (List(2,3,4,5,6))
    }
  }

  "FilterTest" should {
    "" in {
      val lista = List(1,2,3,4,5)

      val resFilter = lista.filter(x => x % 2 == 0)

      resFilter should be( List(2,4) )
    }
  }

}
