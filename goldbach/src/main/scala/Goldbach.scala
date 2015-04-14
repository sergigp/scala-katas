
object Goldbach {

  private def isPrime(number: Int)               = (2 until number) forall (x => number % x != 0)
  private def primesUntil(limit: Int): List[Int] = (2 until limit) filter isPrime toList
  private def combinations(primes: List[Int])    = primes.flatMap(x => primes.map(y => List(x, y).sorted)).distinct

  def calculate(number: Int): List[Int] = {
    val primeCombinations = combinations(primesUntil(number))
    primeCombinations filter (x => x.head + x.last == number) head
  }
}
