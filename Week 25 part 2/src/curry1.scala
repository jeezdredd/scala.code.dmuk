object curry1 {

  def add(x: Int)(y: Int): Int = x + y
  def substr(x: Int)(y: Int): Int = x - y
  def div(x: Int)(y: Int): Int = x/y
  def mul(x: Int)(y: Int): Int = x*y

  def main(args: Array[String]): Unit = {

    (1 to 10) map (add(2)) foreach(print)
    print("\n")
    (1 to 10) map (substr(2)) foreach(print)
    print("\n")
    (1 to 10) map (div(2)) foreach(print)
    print("\n")
    (1 to 10) map (mul(2)) foreach(print)
  }
}
