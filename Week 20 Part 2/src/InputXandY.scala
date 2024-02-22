import scala.io.StdIn.*

object InputXandY {
  def main(args: Array[String]): Unit = {
    print("Enter X integer: ")
    var x: Int = readInt()
    print("Enter Y integer: ")
    var y: Int = readInt()

    println("You've entered " + x + " and " + y)
    println("Your numbers product is " + (x*y) + " and your numbers product is " + (x+y))
  }
}
