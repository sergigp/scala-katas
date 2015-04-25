
object Fibonacci {

//  def get(n: Int): List[Int] = n match {
//    case 0     => List()
//    case 1 | 2 => List.fill(n)(1)
//    case _     => calculateNFibonacciSequence(n, List(1, 1))
//  }
//
//  private def calculateNFibonacciSequence(n: Int, acc: List[Int]): List[Int] = n match {
//    case n if acc.size == n => acc
//    case _          => calculateNFibonacciSequence(n, acc :+ (acc takeRight 2 sum))
//  }

  def get(n: Int): List[Int] = n match {
    case 0     => List()
    case 1 | 2 => List.fill(n)(1)
    case _     => fib take n toList
  }

  private def fib(): Stream[Int] = {
    lazy val fib:Stream[Int] = Stream.cons(1, Stream.cons(1, fib.zip(fib.tail).map(a => a._1 + a._2)))
    fib
  }
}
