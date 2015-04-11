import org.scalatest.{BeforeAndAfter, Matchers, FlatSpec}


class PrimeFactorsCalculatorTest extends FlatSpec with Matchers with BeforeAndAfter {
  var primeFactorsCalculator: PrimeFactorsCalculator = _

  before {
    primeFactorsCalculator = new PrimeFactorsCalculator
  }

  it should "calculate prime factors" in {
    primeFactorsCalculator.calculateFor(1) should be (List(1))
    primeFactorsCalculator.calculateFor(2) should be (List(1, 2))
    primeFactorsCalculator.calculateFor(3) should be (List(1, 3))
    primeFactorsCalculator.calculateFor(4) should be (List(1, 2, 4))
    primeFactorsCalculator.calculateFor(18) should be (List(1, 2, 3, 6, 9, 18))
    primeFactorsCalculator.calculateFor(24) should be (List(1, 2, 3, 4, 6, 8, 12, 24))
  }
}
