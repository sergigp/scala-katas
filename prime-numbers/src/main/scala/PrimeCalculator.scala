class PrimeCalculator {
  def isPrime(n: Int)            = (2 until n) forall (x => n % x != 0)
  def getPrimesUntil(limit: Int) = (1 to limit) filter isPrime
}
