import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object EmployeeArray {
  def main(args: Array[String]): Unit = {

    var nameEmp = ArrayBuffer[String]()
    nameEmp += "Sevastyan"
    nameEmp += "Mikhael"
    nameEmp += "Igor"
    nameEmp += "Nurbolat"
    var ssidEmp = ArrayBuffer[Int]()
    ssidEmp += 1
    ssidEmp += 2
    ssidEmp += 3
    ssidEmp += 4
    var designEmp = ArrayBuffer[String]()
    designEmp += "Designer"
    designEmp += "Manager"
    designEmp += "Director"
    designEmp += "Cleaner"
    var salaryEmp = ArrayBuffer[Float]()
    salaryEmp += 120.300
    salaryEmp += 80.220
    salaryEmp += 250.300
    salaryEmp += 12.300

    var choice: Int = 0

    while (choice != 5) {

      println("|=============================================|")
      println("|=============Employee Management=============|")
      println("|=============================================|")
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
          println("Enter Employee name: ")
          val empName = readLine()
          nameEmp = nameEmp :+ empName

          println("Enter Employee SSID: ")
          val empSSID = readInt()
          ssidEmp = ssidEmp :+ empSSID

          println("Enter Employee designation: ")
          val empDesign = readLine()
          designEmp = designEmp :+ empDesign

          println("Enter Employee salary: ")
          val empSalary = readFloat()
          salaryEmp = salaryEmp :+ empSalary

          println(s"New employee $empName has been added successfully")

        case 2 =>
          print("What record of an employee you would like to delete? \n1. Name \n2. SSID \n3. Designation \n4. Salary \n")
          var choice2 = readInt()

          if (choice2 == 1) {
            print("Type in Employee name: ")
            var name = readLine()
            nameEmp -= (name)

            print(s"Employee $name has been deleted\n")
          } else if (choice == 2) {
            print("Type in Employee SSID: ")
            var ssid = readInt()
            ssidEmp -= (ssid)

            print(f"Employee SSID $ssid has been deleted\n")
          } else if (choice == 3) {
            print("Type in Designation: ")
            var designation = readLine()

            designEmp -= (designation)

            print(f"Employee $designation has been deleted\n")
          } else if (choice == 4) {
            print("Type in Salary: ")
            var salary = readFloat()

            salaryEmp -= (salary)

            print(s"Employee salary of $salary has been deleted\n")
          } else {
            print("Invalid choice. Try again.")
          }

        case 3 =>
          print("Enter Employee SSID to search (only " + ssidEmp.min + " - " + ssidEmp.max + "): ")
          var ssidSearch = readInt()

          print("Searching...")

          if (ssidSearch == ssidEmp.min && ssidSearch == ssidEmp.max) {
            println("Found! ")
            println("Employee name: " + nameEmp(ssidSearch))
            println("Employee SSID: " + ssidSearch)
            println("Employee designation: " + designEmp(ssidSearch))
            println("Employee salary: " + salaryEmp(ssidSearch))
          } else {
            print("\nIncorrect data. Search another employee.\n")
          }

        case 4 =>
          print("Designation salary calculator.\n")
          print("Enter your base salary (/h): ")
          var baseSalary = readInt()
          print("\nEnter your monthly working hours: ")
          var workingHours = readInt()
          var totalSalary = baseSalary * workingHours / 2
          print(s"\nYour total amount to be paid monthly (no tax) is: $totalSalary")
          print("\nEnter your country tax rate (without %): ")
          var taxRate = readInt()
          var totalTaxSalary = totalSalary - (totalSalary * taxRate / 100)
          print(s"\nYour total amount to be paid (with tax) is: $totalTaxSalary\n")


        case 5 => println("Exiting...")
        case _ => println("Invalid choice. Try again.")
      }
    }

    println("\n Good Bye! Thank you.")
  }
}
