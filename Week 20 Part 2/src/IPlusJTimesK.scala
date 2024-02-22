import scala.io.StdIn._

object IPlusJTimesK {
  def main(args: Array[String]): Unit = {
    print("Enter first digit: ")
    var i: Int = readInt()

    print("Enter second digit: ")
    var j: Int = readInt()

    print("Enter the third digit: ")
    var k: Int = readInt()

    print((i + j) * k)
  }
}
