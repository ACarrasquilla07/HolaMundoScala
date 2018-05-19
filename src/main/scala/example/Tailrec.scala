package example

import scala.annotation.tailrec

object Tailrec extends App{

  def factorial(x: Int): Int = {
    @tailrec
    def factLoop(n: Int, acc: Int): Int = {
      if (n <= 0) acc else factLoop(n - 1, n * acc)
    }
    factLoop(x, 1)
  }

  print(factorial(5))
}