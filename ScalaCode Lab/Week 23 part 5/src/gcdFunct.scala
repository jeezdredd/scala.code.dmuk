import scala.io.StdIn._

object gcdFunct {
  def gdc(a: Int, b: Int): String = {
    var c = a
    var d = b
    while {
      while (c < d) {
       d = d - c
      }
      while (d < c) {
       c = c - d
      }
      (c == d)
    } do ()
    return s"Greatest common divisor is $c"
  }

  def main(args: Array[String]): Unit = {
    print("Enter first integer: ")
    var a: Int = readInt()

    print("Enter second integer: ")
    var b: Int = readInt()

    print(s"${gdc(a, b)}")
  }
}
