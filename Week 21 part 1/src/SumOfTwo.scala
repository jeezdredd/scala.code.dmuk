import scala.io.StdIn._

object SumOfTwo {
  def main(args: Array[String]): Unit = {

    print("Enter first digit: ")
    var dig1: Int = readInt()

    print("Enter second digit: ")
    var dig2: Int = readInt()

    print("Enter three digit: ")
    var dig3: Int = readInt()

    if (dig1 + dig2 == dig3) {
      println("YES")
    } else {
      println("NO")
    }
  }
}
