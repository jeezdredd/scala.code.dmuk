object MultipleArgs {

  def largerOf(c: Int, d: Int): Int = if (c>d) c else d

  def main(args: Array[String]): Unit = {

    for(a <- 1 to 3; b <- 1 to 3)
      println(s"Larger of $a and $b is ${largerOf(a,b)}")
  }
}