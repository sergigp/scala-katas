import scala.annotation.tailrec

object Fibonacci {

//  def get(n: Int): List[Int] = n match {
//    case 0     => List()
//    case 1 | 2 => List.fill(n)(1)
//    case _     => calculateNFibonacciSequence(n, List(1, 1))
//  }
//
//  @tailrec
//  private def calculateNFibonacciSequence(n: Int, acc: List[Int]): List[Int] = n match {
//    case _ if acc.size == n => acc
//    case _          => calculateNFibonacciSequence(n, acc :+ (acc takeRight 2 sum))
//  }

  def get(n: Int): List[Int] = n match {
    case 0     => List()
    case 1 | 2 => List.fill(n)(1)
    case _     => fibonacci take n toList
  }

  def fibonacci(): Stream[Int] = {
    def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a + b)
    fib(1, 1)
  }
}
