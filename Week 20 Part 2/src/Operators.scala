object Operators {
  def main(args: Array[String]): Unit = {
    var x: Int = 8
    var y: Int = 5
    var z: Int = 7
    
    println(z + " + " + y + " + " + x + " = " + (z + y + x))
    println(z + " x " + y + " x " + x + " = " + (z * y * x))
    println(z + " - " + y + " x " + x + " = " + (z - y - x))
    println(z + "^sq " + y + "^sq" +  " = " + ((z*z)+(y*y)+(x*x)))


  }
}

//Output:
//1XY=5 (1 * 5 = 5)
//10XY=50 (10 * 5 = 50)
//100XY=500 (100 * 5 = 500)
