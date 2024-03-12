import scala.io.StdIn._

object ModuleResults {

  def getResult(c: Int, d: Int): String = {
    var coursework = c
    var examination = d
    var result = coursework + examination / 2
    if (result >= 40 && coursework >= 40 && examination >= 40) {
      return "Passed"
    } else if (examination < 40) {
      return "Resit coursework"
    } else if (coursework < 40) {
      return "Resit examination"
    } else if (result < 40 && coursework < 40 && examination < 40) {
      return "Resit module"
    } else {
      return "Invalid input. Try again"
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter examination result: ")
    var a: Int = readInt()

    print("Enter coursework result: ")
    var b: Int = readInt()

    print(s"${getResult(a,b)}")
  }
}

