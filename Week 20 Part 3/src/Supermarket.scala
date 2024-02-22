import scala.io.StdIn._

object Supermarket {
  def main(args: Array[String]): Unit = {
    var shoppingList: List[String] = List()
    var choice: Int = 0

    while (choice != 4) {

      println("==================================================")
      println("==========Welcome to Magnum Supermarket!==========")
      println("==================================================")
      println("1. Add item to shopping cart")
      println("2. Clear shopping cart")
      println("3. Show shopping cart")
      println("4. Exit")

      print("Enter your choice: ")
      choice = readInt()

      choice match {
        case 1 =>
          print("Enter item name: ")
          val item = readLine()
          shoppingList = shoppingList :+ item
          println(s"Item '$item' added to shopping cart.")

        case 2 =>
          shoppingList = List()
          println("Shopping cart cleared.")

        case 3 =>
          if (shoppingList.isEmpty) {
            println("Shopping cart is empty.")
          } else {
            println("Your shopping cart:")
            shoppingList.foreach(println)
          }

        case 4 => println("Exiting...")
        case _ => println("Invalid choice. Please try again.")
      }
    }

    println("\nThank you for shopping at Magnum Supermarket!")
  }
}