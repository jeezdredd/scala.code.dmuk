class Counter{

  private var value: Int = 0

  def inc(n: Int): Unit = {
    for (i <- 1 to n) inc()
  }

  def inc(): Unit = {
    value+=1
  }

  def getValue: Int = {
    return value
  }
}

object UseCounter {
  def main(args: Array[String]): Unit = {
    var counter1: Counter = new Counter()
    println("counter 1: "+counter1.getValue)
    counter1.inc()
    println("counter 1: "+counter1.getValue)
    counter1.inc(5)
    println("counter 1: "+counter1.getValue)
  }
}