object MathFuns4 {

  def add(x: Int, y: Int): Int = x+y
  def sub(x: Int, y: Int): Int = x-y
  def mul(x: Int, y: Int): Int = x*y

  val div: (Int,Int) => Int = (x,y) => x/y

  def main(args: Array[String]): Unit = {

    println( (1 to 10) map (add(_,1)) )
    println( (1 to 10) map (sub(0,_)) )
    println( (1 to 10) map (mul(_,2)) )
    println( (1 to 10) map (div(100,_)) )
  }
}