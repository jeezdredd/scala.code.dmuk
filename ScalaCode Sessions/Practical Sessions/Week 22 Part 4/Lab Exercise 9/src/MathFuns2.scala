import scala.math._
import scala.io.StdIn._

object MathFuns2 {
  def main(args: Array[String]): Unit = {

    def prime(n: Long): Boolean = {
      if (n <= 1) return false
      if (n == 2 || n == 3) return true
      if (n % 2 == 0 || n % 3 == 0) return false
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      true
    }
    val numbers = List(2, 8, 23, 1, 11, 10)
    numbers.foreach(n => println(s"$n is prime: " + prime(n)))


    def perfect(n: Long): Boolean = {
      if (n <= 1) return false
      var sum = 1L
      val sqrtN = Math.sqrt(n).toInt
      for (i <- 2 to sqrtN) {
        if (n % i == 0) {
          sum = sum + i
          if (i * i != n) {
            sum = sum + n / i
          }
        }
      }
      sum == n
    }

    val numbers1 = List(6, 28, 496, 8128, 12345)
    val perfectNumbers = numbers1.filter(perfect)
    print("\nPerfect numbers:", perfectNumbers)


    def digitToWord(n: Int): String = {
      if (n == 0) {
        return("ZERO")
      } else if (n == 1) {
        return("ONE")
      } else if (n == 2) {
        return("TWO")
      } else if (n == 3) {
        return("THREE")
      } else if (n == 4) {
        return("FOUR")
      } else if (n == 5) {
        return("FIVE")
      } else if (n == 6) {
        return("SIX")
      } else if (n == 7) {
        return("SEVEN")
      } else if (n == 8) {
        return("EIGHT")
      } else if (n == 9) {
        return("NINE")
      } else {
        return("bad digit")
      }
    }

    print("\n\nEnter digit: ")
    var inputNum = readInt()
    val result = digitToWord(inputNum)
    println(result)

    def WordToDigit(n: String): Int = {
      if (n == "ZERO" || n == "zero") {
        return (0)
      } else if (n == "ONE" || n == "one") {
        return (1)
      } else if (n == "TWO" || n == "two") {
        return (2)
      } else if (n == "THREE" || n == "three") {
        return (3)
      } else if (n == "FOUR" || n == "four") {
        return (4)
      } else if (n == "FIVE" || n == "five") {
        return (5)
      } else if (n == "SIX" || n == "six") {
        return (6)
      } else if (n == "SEVEN" || n == "seven") {
        return (7)
      } else if (n == "EIGHT" || n == "eight") {
        return (8)
      } else if (n == "NINE" || n == "nine") {
        return (9)
      } else {
        return (-1)
      }
    }
    print("Enter digit in words: ")
    val inputNum2: String = readLine()
    var result2 = WordToDigit(inputNum2)
    println(result2)

    def yearCheck(n: Int): Boolean = {
      if (n % 400 == 0) {
        return true
      } else if (n % 4 == 0) {
        return true
      } else if (n % 100 == 0) {
        return false
      } else {
        return false
      }
    }

    print("Enter year for check: ")
    var checkIfTrue: Int = readInt()
    var result3 = yearCheck(checkIfTrue)

    if (result3) {
      print("Year is a leap year")
    } else {
      print("Year is not a leap year")
    }


  }
}

