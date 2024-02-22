import scala.io.StdIn._

object SumSqToN {
  def main(args: Array[String]): Unit = {

    print("Enter one value: ")
    var N: Int = readInt()

    var sumSq = N * (N + 1) * (2 * N + 1) / 6

    print("Your result is: " + sumSq)
  }
}
