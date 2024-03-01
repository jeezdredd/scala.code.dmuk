import scala.io.StdIn._

object NumericSequence {
  def main(args: Array[String]): Unit = {
    println("First digit? ")
    var start: Int = readInt()

    println("Last digit? ")
    var end: Int = readInt()

    if (start < end) {
      for (x <- start to end) {
        println(x)
      }
    } else {
      for (x <- start.toInt to end.toInt by -1) {
        println(x.toInt)
      }
    }
  }
}
