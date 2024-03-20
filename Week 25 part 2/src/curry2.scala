object curry2 {
  def eq(c: Char)(d: Char) = c == d

  def main(args: Array[String]): Unit = {
    "aardvark".toList filter (eq('a'))
  }
  
}
