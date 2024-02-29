import scala.io.StdIn._

object PracticalParameter {
 def sqrtAndDivide(x: Double): Double => Double = {
  val sqrtX = math.sqrt(x)
  println(s"Square root of $x: $sqrtX")
  y => x / y
 }

 def main(args: Array[String]): Unit = {
 val input = readLine("Enter a number: ").toDouble
 val functionTest = sqrtAndDivide(input)
 }
}
