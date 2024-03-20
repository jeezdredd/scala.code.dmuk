object countdownObj {
  def countdown(n: Int): Unit = {
    print(s"$n ")
    if (n == 0)
      println("Stopped")
    else
      countdown(n - 1)
  }

  def countTo10(c: Int): Unit = {
    print(s"$c ")
    if (c == 10)
      println("Stopped at 10")
    else
      countTo10(c + 1)
  }

  def countToN(c: Int, g: Int): Unit = {
    print(s"$c ")

    if (c == g)
      println("Stopped")
    else
      countToN(c + 1, g)
  }

  def reverseCountToN(start: Int, end: Int): Unit = {
    print(s"$start ")

    if (end == start)
      print("Stopped")
    else
      reverseCountToN(start - 1, end)
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }


  def sumFromTo(c: Int, b: Int): Int = {
      if (c > b) return 0
      else c + sumFromTo(c + 1, b)
  }

  def sumFromTo2(c: Int, b: Int): Unit = {
    if (c > b) return 0
    else {
      while (c != b) {
        var result = c + (b - 1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(s"${countdown(10)}")
    println(s"${countTo10(0)}")
    println(s"${countToN(17,25)}")
    println(s"${reverseCountToN(25,17)}")
    println(s"Result: ${factorial(6)}")
    println(s"Result: ${sumFromTo2(5,4)}")
    println(s"Result: ${sumFromTo2(7,7)}")
    println(s"Result: ${sumFromTo2(2,5)}")
  }
}
