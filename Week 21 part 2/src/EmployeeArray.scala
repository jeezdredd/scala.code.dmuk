import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object EmployeeArray {
  def main(args: Array[String]): Unit = {

    var nameEmp = ArrayBuffer[String]()
    var ssidEmp = ArrayBuffer[Int]()
    var designEmp = ArrayBuffer[String]()
    var salaryEmp = ArrayBuffer[Float]()

    var choice: Int = 0

    while (choice != 5) {


      println("===================")
      println("Employee Management")
      println("===================")
      println("Menu:")
      println("1. Add an Employee Record")
      println("2. Delete an Employee Record")
      println("3. Search Employee record by SSID")
      println("4. Calculate total salary based on designation")
      println("5. Exit")

      print("Choose option: ")
      choice = readInt()

      choice match {
        case 1 =>
          print("Enter Employee name: ")
          val empName = readLine()
          nameEmp = nameEmp :+ empName

          print("Enter Employee SSID: ")
          val empSSID = readInt()
          ssidEmp = ssidEmp :+ empSSID

          print("Enter Employee designation: ")
          val empDesign = readLine()
          designEmp = designEmp :+ empDesign

          print("Enter Employee salary: ")
          val empSalary = readFloat()
          salaryEmp = salaryEmp :+ empSalary

          print("New employee " + empName + " has been added successfully")

        case 2 =>
          print("What record of an employee you would like to delete?")
          var choice2 = readInt()

          if (choice2 == 1) {
            print("Type in number")
          }
      }

    }
  }
}
