package Banco

case class CuentaBanco (numeroCuenta: Int,
                        codigoPropietario: Int,
                        valorCuenta: Long,
                        tipoCuenta: TipoCuenta
                       )

object CuentaBanco {
  def apply(numeroCuenta: Int,
            codigoPropietario: Int,
            valorCuenta: Long,
            tipoCuenta: TipoCuenta):
  Either[String, CuentaBanco] = {
    if (valorCuenta < 0) {
      Left("No es posible crear cuenta con saldo negativo")
    }
    else {
      Right(new CuentaBanco(numeroCuenta, codigoPropietario, valorCuenta, tipoCuenta) )
    }
  }
}
