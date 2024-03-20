import scala.io.StdIn._

object bracket {

  private def bracket(left: String)(right: String)(whatever: String) = left + whatever + right

  def main(args: Array[String]): Unit = {


    println("Enter sentence one: ")
    val sentence1 = readLine()

    println("Enter sentence two: ")
    val sentence2 = readLine()

    println("Enter sentence three: ")
    val sentence3 = readLine()

    println(bracket(sentence1)(sentence3)(sentence2))
  }

}
