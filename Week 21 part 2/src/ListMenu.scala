import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()

    print("Enter end value of list (exclusive) ")
    var end = readInt()

    var xs = List.range(start, end)

    var cmd = ""

    while (cmd != "End") {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()

      if (cmd == "Take") {
        print("Please provide the amount to take: ")
        var takeDo = readInt()

        println("Taken amount from the list: " + xs.take(takeDo))
      } else if (cmd == "TakeR") {
        println("Please provide the amount to takeRight: ")
        var takeDo = readInt()

        println("Taken right amount from the list: " + xs.takeRight(takeDo))
      } else if (cmd == "Drop") {
        println("Please specify amount to drop from the list: ")
        var dropDo = readInt()

        println("Dropped amount from the list: " + xs.drop(dropDo))
      } else if (cmd == "DropR") {
        println("Please specify amount to drop right from the list: ")
        var dropDo = readInt()

        println("Dropped right amount from the list: " + xs.dropRight(dropDo))
      } else {
        print("Unknown command. Try again.")
      }
    }

    println("Exiting program...")
  }
}