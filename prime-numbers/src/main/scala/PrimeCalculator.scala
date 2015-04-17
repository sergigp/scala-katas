class PrimeCalculator {
  def isPrime(n: Int)            = (2 until n) forall (n % _ != 0)
  def getPrimesUntil(limit: Int) = (1 to limit) filter isPrime
}
