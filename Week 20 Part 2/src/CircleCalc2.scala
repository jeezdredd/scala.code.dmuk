import scala.io.StdIn._

object CircleCalc2 {
  def main(args: Array[String]): Unit = {
    var pi: Double = 3.141

    print("Enter circle diameter: ")
    var diamIn: Int = readInt()

    print("A circle with diameter " + diamIn + " has a circumference of " + pi * diamIn)
  }
}
