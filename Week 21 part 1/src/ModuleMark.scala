import scala.io.StdIn._

object ModuleMark {
  def main(args: Array[String]): Unit = {

    print("Enter your grade for coursework: ")
    var inputCourse: Int = readInt()

    print("Enter your grade for the examination: ")
    var inputExam: Int = readInt()

    var totalGrade = inputExam/2 + inputCourse/2

    if (totalGrade < 40) {
      println("Sorry, you have not reached 40%. You didnt pass the module.")
    } else {
      if (totalGrade >= 40) {
        println("Congratulations! You have passed the module.")
      } else if (inputCourse == 0 && inputExam == 40) {
        println("Resit coursework. You have reached " + inputCourse + "%")
      } else if (inputCourse == 0 && inputExam == 40) {
        println("Resit examination. You have reached " + inputExam + "%")
      } else {
        println("Error. Re-enter your grade")
      }
    }
  }
}
