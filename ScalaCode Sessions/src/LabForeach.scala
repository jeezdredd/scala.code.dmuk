object LabForeach {
  def main(args: Array[String]): Unit = {
  var myArray = Array[Int](10,20,30,40,50,60,70,67,84,34,34)

//    for item <- myArray do {
//      if (item >= 40) {
//        println(item)
//      }
//    }

    myArray.filter(item => item >= 40).foreach(item => println(item))
  }
}
