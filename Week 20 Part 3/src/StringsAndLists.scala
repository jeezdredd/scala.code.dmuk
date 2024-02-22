import scala.io.StdIn._

object StringsAndLists {
  def main(args: Array[String]): Unit = {
        var s1: List[String] = List("Mary", "had", "a", "little", "lamb")

        for (word <- s1) {
          print(word.head.toUpper + " ")
        }
        println()

    //    println(s1(0).toUpperCase())
  }
}

