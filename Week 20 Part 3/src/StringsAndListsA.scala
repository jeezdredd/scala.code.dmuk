import scala.io.StdIn._

object StringsAndListsA {
  def main(args: Array[String]): Unit = {
    print("Please enter your first name: ")
    var m1: String = readLine()

    print("Please enter your surname: ")
    var m2: String = readLine()

    var fName = m1.charAt(0)
    var sName = m2.charAt(0)
    var emailAddr = m1.toLowerCase().charAt(0) + "." + m2.toLowerCase() + "@email.dmu.ac.uk"

    println("Your full name: " + m1 + " " + m2)
    println("Your initials: " + fName + sName)
    print("Preferred email address: " + emailAddr)


  }
}
