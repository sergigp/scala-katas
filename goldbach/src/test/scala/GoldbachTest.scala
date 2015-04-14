import org.scalatest.{FlatSpec, Matchers}

class GoldbachTest extends FlatSpec with Matchers {

  it should "find two prime numbers which sums the number" in {
    Goldbach.calculate(6) should be (List(3, 3))
    Goldbach.calculate(8) should be (List(3, 5))
    Goldbach.calculate(10) should be (List(3, 7))
    Goldbach.calculate(28) should be (List(5, 23))
    Goldbach.calculate(99) should be (List(2, 97))
  }
}
