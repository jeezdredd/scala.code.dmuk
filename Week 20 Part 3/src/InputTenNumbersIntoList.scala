import scala.io.StdIn._

object InputTenNumbersIntoList {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()

    for (i <- 1 to 10) {
      println("Enter number: " )
      xs = xs :+ readInt()
    }

    println("Numbers in reverse order: ")
    xs.reverse.foreach(print(_))
    println()


  }
}
