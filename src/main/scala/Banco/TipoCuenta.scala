package Banco

sealed trait TipoCuenta

case object Cheques extends TipoCuenta
case object Ahorros extends TipoCuenta
case object Fiduciaria extends TipoCuenta

object TipoCuenta {
  def apply(tipoCuenta: String): Either[String, TipoCuenta] = tipoCuenta.toLowerCase match {
    case "cheques" => Right(Cheques)
    case "ahorros" => Right(Ahorros)
    case "fiduciaria" => Right(Fiduciaria)
    case _ => Left("No es un tipo valido")
  }
}
