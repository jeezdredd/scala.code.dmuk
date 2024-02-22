import scala.io.StdIn._

object InOutStrings2 {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first name: ")
    var lastName: String = readLine("Enter your last name: ")
    var specName: String = readLine("Enter your title: ")
    print("Enter your first name initial: ")
    var initialName: Char = readChar()
    print("Enter your house number: ")
    var houseNum: Int = readInt()
    var adrName: String = readLine("Enter your address: ")
    print("Enter your phone number: ")
    var pNum: Long = readLong()
    print("Enter your salary: ")
    var salSp: Int = readInt()

    println("Your name is " + specName + " " + firstName + " " + lastName)
    println("Your initial is " + initialName)
    println("Your house number is " + houseNum)
    println("Your full address is " + houseNum + " " + adrName)
    println("Your phone number is " + pNum)
    println("Your salary is " + salSp)

  }
}