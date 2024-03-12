object smallerOf3 {
    def largerOf(c: Int, d: Int, e: Int): Int = {
      if (c > d && c > e) {
        return c
      } else if (d > c && d > e) {
        return d
      } else if (e > c && e > d) {
        return e
      } else {
        return 0
      }
    }

    def main(args: Array[String]): Unit = {

      for (a <- 1 to 3; b <- 1 to 3; f <- 1 to 3)
        println(s"Larger of $a and $b and $f is ${largerOf(a, b, f)}")
    }
}
