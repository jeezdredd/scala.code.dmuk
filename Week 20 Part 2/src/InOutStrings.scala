import scala.io.StdIn._

object InOutStrings {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first name: ")

    var lastName: String = readLine("Enter your last name: ")

    var specName: String = readLine("Enter your title: ")

    println("Your name is " + specName + " " + firstName + " " + lastName)
  }
}