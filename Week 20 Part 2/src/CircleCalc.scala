import scala.io.StdIn._

object CircleCalc {
  def main(args: Array[String]): Unit = {

    var pi: Double = 3.14

    print("Enter circle diameter: ")
    var diamIn: Int = readInt()

    var resCirc = pi * diamIn

    print("A circle with diameter " + diamIn + " has a circumference of " + resCirc)
  }
}