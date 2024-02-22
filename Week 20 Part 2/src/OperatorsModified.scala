import scala.io.StdIn._

object OperatorsModified {
  def main(args: Array[String]): Unit = {
    println("Enter first digit: ")
    var y: Int = readInt()

    println("Enter second digit: ")
    var z: Int = readInt()

    println("Numbers sum: " + z + " + " + y + " = " + (z + y))
    println("Numbers multiplication: " + z + " x " + y + " = " + (z * y))
    println("Numbers substraction: " + z + " - " + y + " = " + (z - y))
    println("Numbers squared: " + z + "^sq " + y + "^sq" + " = " + ((z * z) + (y * y)))
  }
}
