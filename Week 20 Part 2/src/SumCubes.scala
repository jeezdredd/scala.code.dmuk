import scala.io.StdIn._

object SumCubes {
  def main(args: Array[String]): Unit = {
    print("Enter one value: ")
    var N: Int = readInt()

    var sumCubes = Math.pow(N, 2) * Math.pow((N + 1), 2) / 4

    print("Your value is: " + sumCubes)
  }
}
