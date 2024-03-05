import scala.io.StdIn._

object Rectangle {
  def main(args: Array[String]): Unit = {

    print("Amount of rows: ")
    var size1: Int = readInt()

    print("Amount of columns: ")
    var size2: Int = readInt()

    if (size1 < size2) {
      for (row <- 1 to size1) {
        for (col <- 1 to size2) {
          print("* ")
        }
        print("\n")
      }
    } else {
      print("Invalid parameters. Re-try")
    }
  }
}
