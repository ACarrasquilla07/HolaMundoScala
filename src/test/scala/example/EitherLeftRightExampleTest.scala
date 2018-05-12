import example.EitherLeftRightExample
import org.scalatest.{AsyncWordSpec, Matchers}

class EitherLeftRightExampleTest extends AsyncWordSpec with Matchers{

  "EitherRightTest" should{
    "" in{
      val valor = EitherLeftRightExample.divide(9,9)
      Right(1) should be(valor)
    }
  }

  "EitherLeftTest" should{
    "" in{
      val valor = EitherLeftRightExample.divide(9,0)
      Left("No es posible dividir por cero") should be(valor)
    }
  }
}
