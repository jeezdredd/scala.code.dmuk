import scala.io.StdIn._

object Rectangle {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height of the rectangle? ")
    val rectHeight = readInt()

    print("Select how many units for the width of the rectangle? ")
    val rectWidth = readInt()

    println()

    var row: Int = 1

    while (row <= rectHeight) {
      var col: Int = 1
      while (col <= rectWidth) {
        print("* ")
        col += 1
      }

      print("\n")
      row += 1
    }

  }
}
