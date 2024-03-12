import scala.io.StdIn._

object medianOf3 {
  def averageNum(c: Int, d: Int, f: Int): Int = {
  var result = (c + d + f) / 3
    return result
  }

  def main(args: Array[String]): Unit = {
    print("Enter first digit: ")
    var a: Int = readInt()

    print("Enter second digit: ")
    var b: Int = readInt()

    print("Enter third digit: ")
    var g: Int = readInt()

    print(s"The median of numbers $a, $b and $g is: ${averageNum(a,b,g)}")
  }
}
