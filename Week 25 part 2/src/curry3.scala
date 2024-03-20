import scala.io.StdIn._

object curry3 {
  private def lengthEquals(int: Int)(str: String): Boolean = {
    str.length == int
  }

  private val words = List("apple", "pear", "banana", "peach")

  def main(args: Array[String]): Unit = {
    println("Enter digit: ")
    val digit = readInt()
    val filteredWords = words.filter(lengthEquals(digit))
    println(filteredWords)
  }
}
