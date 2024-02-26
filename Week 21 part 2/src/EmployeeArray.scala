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

            print(s"Employee $name has been deleted")
          } else if (choice == 2) {
            print("Type in Employee SSID: ")
            var ssid = readInt()
            ssidEmp -= (ssid)

            print(f"Employee SSID $ssid has been deleted")
          } else if (choice == 3) {
            print("Type in Designation: ")
            var designation = readLine()

            designEmp -= (designation)

            print(f"Employee $designation has been deleted")
          } else if (choice == 4) {
            print("Type in Salary: ")
            var salary = readFloat()

            salaryEmp -= (salary)

            print(s"Employee salary of $salary has been deleted")
          } else {
            print("Invalid choice. Try again.")
          }

        case 3 =>
          print("Enter Employee SSID to search (only " + ssidEmp.min + " - " + ssidEmp.max + "): ")
          var ssidSearch = readInt()

          print("Searching...")

          if (ssidSearch <= 1000) {
            println("Found! ")
            println("Employee name: " + nameEmp(ssidSearch))
            println("Employee SSID: " + ssidSearch)
            println("Employee designation: " + designEmp(ssidSearch))
            println("Employee salary: " + salaryEmp(ssidSearch))
          } else {
            print("Incorrect data. Search another employee.")
          }

        case 4 =>
          print("Designation salary calculator.\n")
          print("Enter your designation to calculate: ")
          var calcDes = readLine()

          val work1: String = "Designer"
          val work2: String = "Manager"
          val work3: String = "Director"
          val work4: String = "Cleaner"

          if (calcDes == work1) {
            val result = 2000 * 100 / 20

            println(s"\nYour salary on $work1 position is: $result" + "$k\\py")
          } else if (calcDes == work2) {
            val result = 1500 * 100 / 20

            println(s"\nYour salary on $work2 position is: $result" + "$k\\py")
          } else if (calcDes == work3) {
            val result = 5000 * 100 / 20

            println(s"\nYour salary on $work3 position is: $result" + "$k\\py")
          } else if (calcDes == work4) {
            val result = 500 * 100 / 20

            println(s"\nYour salary on work $work4 position is: $result" + "$k\\py")
          } else {
            print("Incorrect designation. Try again.")
          }

        case 5 => println("Exiting...")
        case _ => println("Invalid choice. Try again.")
      }

    }

    println("\n Good Bye! Thank you.")
  }
}
