import org.scalatest.{Matchers, FlatSpec}

class FibonacciTest extends FlatSpec with Matchers {

  it should "return the N first elements of fibonacci sequence" in {
    Fibonacci.get(0) should be (List())
    Fibonacci.get(1) should be (List(1))
    Fibonacci.get(2) should be (List(1, 1))
    Fibonacci.get(3) should be (List(1, 1, 2))
    Fibonacci.get(5) should be (List(1, 1, 2, 3, 5))
    Fibonacci.get(8) should be (List(1, 1, 2, 3, 5, 8, 13, 21))
  }
}
