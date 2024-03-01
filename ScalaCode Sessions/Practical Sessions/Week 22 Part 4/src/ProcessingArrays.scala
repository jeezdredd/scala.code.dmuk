import scala.io.StdIn._

object ProcessingArrays {
  def main(args: Array[String]): Unit = {

    print("Enter array size: ")
    var size: Int = readInt()

    var nums = new Array[Int](size)

    for (i <- 0 until size) {
      print(s"Enter value for element ${i + 1}: ")
      nums(i) = scala.io.StdIn.readInt()
    }

    for (i <- nums.indices) {
      nums(i) = i + 1
    }

    for (x <- nums) {
      print(x + " ")
    }
  }
}