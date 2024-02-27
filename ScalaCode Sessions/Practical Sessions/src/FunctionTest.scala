
object FunctionTest {
  def main(args: Array[String]): Unit = {
    var res = add(34.46, 43.65)
    println(res)
    val calcObject = new Calculator()
    val result1 = calcObject.subtraction(97.89, 34.56)
    println(result1)
  }

  private def add(a: Double, b: Double): Double = {
    a + b
  }
}

class Calculator {
  def subtraction(a: Double, b: Double): Double = {
    a - b
  }
}