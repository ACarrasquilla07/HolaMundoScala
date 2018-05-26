package Banco.Servicios

import Banco.CuentaBanco

//Credit
class Consignacion {

  def consignar(cuenta: CuentaBanco, valor: Long): Either[String, CuentaBanco] = {
    if(valor <= 0){
      Left("No es posible consignar el valor")
    }
    else {
      Right(cuenta.copy(valorCuenta = cuenta.valorCuenta + valor))
    }
  }
}
