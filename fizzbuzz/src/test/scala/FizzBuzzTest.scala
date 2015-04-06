import org.scalatest.{BeforeAndAfter, Matchers, FlatSpec}

class FizzBuzzTest extends FlatSpec with Matchers with BeforeAndAfter{

  var fizzbuzz: FizzBuzz = _

  before {
    fizzbuzz = new FizzBuzz
  }

  it should "return fizz if number is multiple of 3" in {
    fizzbuzz.getResult(3) should be ("fizz")
    fizzbuzz.getResult(6) should be ("fizz")
    fizzbuzz.getResult(9) should be ("fizz")
    fizzbuzz.getResult(27) should be ("fizz")
  }

  it should "return buzz if number is multiple of 5" in {
    fizzbuzz.getResult(5) should be ("buzz")
    fizzbuzz.getResult(10) should be ("buzz")
    fizzbuzz.getResult(20) should be ("buzz")
    fizzbuzz.getResult(100) should be ("buzz")
  }

  it should "return fizzbuzz if number is multiple of 3 and 5" in {
    fizzbuzz.getResult(15) should be ("fizzbuzz")
    fizzbuzz.getResult(30) should be ("fizzbuzz")
    fizzbuzz.getResult(45) should be ("fizzbuzz")
    fizzbuzz.getResult(90) should be ("fizzbuzz")
  }
}
