import scala.io.StdIn._

object PhaseTest2 {
  def main(args: Array[String]): Unit = {

    var count: Int = 1

    while (count < 10) {
      println(count)
      count += 1
    }

    var row: Int = 1
    var height = 4
    var width = 10

    while (row <= height) {
      var col: Int = 1

      while (col <= width) {
        print("*")
        col += 1
      }

      print("\n")
      row += 1
    }


    var i = 1

    while (i <= 3) {
      println("outer *" + i)

      var j = 1

      while (j <= i) {
        println("inner *" + j)
        j += 1
      }

      i += 1
    }

    //ARRAY ITERATION UNTIL < SIZE OF ARRAY:
      var nums = new Array[Int](10)
      var i = 0

      while (i < nums.length) {
        nums(i) = i + 1
        i += 1
      }

      print(i)

    //DYNAMIC ARRAY SIZE SUPPORT (entered by user):
      print("Enter size of array: ")
      var size = readInt()
      var nums = new Array[Int](size)
      var i = 0

      while (i < nums.length) {
        println(nums(i))
        i += 1
      }

    //ACCESSING AND PRINTING EACH ELEMENT IN THE ARRAY :
      var fruit = Array("apple", "pear", "banana", "grape")

      var i = 0

      while (i < fruit.length) {
        println(fruit(i).toUpperCase())
        i += 1
      }


    //REPRESENTATION OF THE MULTI DIMENSIONAL ARRAYS (printing 0):
    // USING NESTED LOOP IN TWO DIMENSIONAL ARRAYS
    print("Rows? ")
    var rows = readInt()

    print("Columns? ")
    var cols = readInt()

    var table = Array.ofDim[Int](rows, cols)
    var i = 0

    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        print(table(i)(j))
        j += 1
      }
      print("\n")
      i += 1
    }


    //NESTED LOOPS TO POPULATE ARRAYS
    println("Rows? ")
    var rows = readInt();
    println("Columns? ")
    var cols = readInt()
    var table = Array.ofDim[Int](rows, cols)
    var i = 0
    while (i < rows) {
      var j = 0
      while (j < cols) {
        table(i)(j) = (i + 1) * (j + 1)
        j += 1
      }
      i += 1
    }

    val arr = Array(10, 50, 40, 60, 80, 90)
    // Using for and yield here
    var result = for (x <- arr) yield x
    // printing output
    for (r <- result) {
      // result here ''''''
      println("yield value is ::")
      println(r)
    }

    //Character filter (if UpperCase):
      print("Enter character sequence: ")
      var sentence: String = readLine()

      for (letter <- sentence if letter.isUpper) {
        println(letter)
      }

    //Integer sequence (excluding 5):
    for (x <- 1 to 10 if x != 5) {
      println(x)
    }

    //Yield statement usage:
      val arr = Array[Int](1, 2, 3, 4, 5)
      var result = for (x <- arr) yield x*x

    //Yield statement usage
    with two string :
      val nouns = List("apple", "banana", "orange")
      val adjectives = List("red", "yellow", "orange")

      val phrases = for {
        noun <- nouns
        adjective <- adjectives
      } yield s"$adjective $noun"

      println(phrases)

    //Alternative way of using the yield statement(multiparameter)
    val nouns = List("apple", "banana", "orange")
    val adjectives = List("red", "yellow", "orange")

    val phrases = for (noun <- nouns; adjective <- adjectives) yield s"$adjective $noun"
    println(phrases)

    val colours = List("red", "blue", "yellow", "black")
    val vehicles = List("car", "bus", "van", "plane")

    val compound = for (colour <- colours; vehicle <- vehicles) yield s"$colour $vehicle"
    println(compound)

    //WHILE CYCLE:
    var xs: List[Int] = List()
    print("First number? ")
    var num = readInt()

    while (num >= 0) {
      xs = xs :+ num
      print("Another number? ")
      num = readInt()
    }
    print(xs)

    var i = 1
    while (i <= 3) {
      print("outer " + i)
      var j = 1
      while (j <= i) {
        print("inner " + j)
        j += 1
      }
      i += 1
      print("\n")
    }

    var nums = List.range(1, 30).filter(_ % 3 == 0)
    println(nums)


  }
}
