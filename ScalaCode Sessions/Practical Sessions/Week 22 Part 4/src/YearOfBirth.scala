import scala.io.StdIn._

object YearOfBirth {
  def main(args: Array[String]): Unit = {
    print("Enter your year of birth: ")
    var yob: Int = readInt()

    print("Enter current year: ")
    var cy: Int = readInt()

    val yearList = for (year <- yob to cy) yield year

    for (year <- yearList) {
      println(year)
    }
  }
}
