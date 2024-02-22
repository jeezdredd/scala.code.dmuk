import scala.io.StdIn._

object Checkout {
  def main(args: Array[String]): Unit = {

    var myList: List[Double] = List()

    print("Price? ")
    var num = readDouble()

    while (num > 0.0) {
      myList = myList :+ num

      print("Price? ")
      num = readDouble()
    }
    println("-------------")
    println("Total: " + myList.sum + "( " + myList.count + " )")
  }
}