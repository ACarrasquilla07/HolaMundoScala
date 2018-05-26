package Banco

import org.scalatest.{AsyncWordSpec, Matchers}


class CuentaBancoTest extends AsyncWordSpec with Matchers{

  "CrearCuentaValorNegativoTest" should {
    "" in {
      val tipoCuenta = Cheques

      val saldo : Long = -1

      val cuentaAndres: Either[String, CuentaBanco] = CuentaBanco(1, 1, saldo, tipoCuenta)

      cuentaAndres.isLeft should be (true)
      cuentaAndres should be (Left("No es posible crear cuenta con saldo negativo"))
      cuentaAndres.isRight should be (false)
    }
  }

  "CreateCountPositiveValueTest" should {
    "" in {
      val tipoCuenta = Cheques

      val saldo : Long = 0
      val cuentaAndres: Either[String, CuentaBanco] = CuentaBanco(1, 1, saldo, tipoCuenta)

      cuentaAndres.isRight should be (true)
      cuentaAndres.isLeft should be (false)
    }
  }

}
