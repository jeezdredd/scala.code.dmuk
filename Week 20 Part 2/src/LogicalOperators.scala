import scala.io.StdIn._

object LogicalOperators {
  def main(args: Array[String]): Unit = {
    print("Enter first boolean value (T or F): ")
    var valueOne = readBoolean()
    print("Enter second boolean value (T or F): ")
    var valueTwo = readBoolean()

    var andResult = valueOne && valueTwo
    var orResult = valueOne || valueTwo

    println("$valueOne AND $valueTwo is $andResult")
    println("$valueOne AND $valueTwo is $orResult")

    println("\nTruth Table for AND:")
    println("A\tB\tA && B")

    println("\nTruth Table for OR:")
    println("A\tB\tA || B")

    def printTruthTable(operator: (Boolean, Boolean) => Boolean): Unit = {
      for (a <- Seq(true, false); b <- Seq(true,false)) {
        println("$a\t$b\t${operator(a,b)}")
      }
    }
  }
}
