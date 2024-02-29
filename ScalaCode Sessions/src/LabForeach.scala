object LabForeach {
  def main(args: Array[String]): Unit = {
  var myArray = Array[Int](10,53,42,53,8,7,16,18,21,65)

//    for item <- myArray do {
//      if (item >= 40) {
//        println(item)
//      }
//    }

    var array = myArray.filter(item => item < 20)
    array.foreach()
  }
}
