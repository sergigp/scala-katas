
class PrimeFactorsCalculator {
  def calculateFor(x: Int) = {

    def isDivisible(number: Int, possibleDivisor: Int) = number % possibleDivisor == 0

    def getPrimeFactors(y: Int, acc: List[Int]): List[Int] = {
      if (y > x / 2) acc :+ x
      else getPrimeFactors(y + 1, if (isDivisible(x, y)) acc :+ y else acc)
    }

    getPrimeFactors(1, List())
  }
}
