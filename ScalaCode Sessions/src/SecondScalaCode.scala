object SecondScalaCode {

  def main(args:Array[String]):Unit ={

    var uni:String ="  DMUK  "
    uni =uni.trim.

      concat(" is located in Almaty?")

    println(uni)

    var newString = uni.substring(8, 15)

    if(uni.

      contains("Almaty")){

      println("Yes, it is "+uni.substring(8, 15))
    }

    //    var words: Array[String] = uni.split(" ")
    //    println(words(0))
    //    println(words(1))

    //        var name = readLine("Enter your name: ")
    //        var uni: String = "   dmuk   "
    //
    //        println("Welcome " + name.toUpperCase())
    //        println(uni.trim.toUpperCase())
  }
}
