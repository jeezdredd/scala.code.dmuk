object Speed {
  def main(args: Array[String]): Unit = {
    var initial: Int = 30
    var acceleration: Int = 15
    var time: Int = 7
    var finalSpeed = initial + acceleration * time

    print("Final speed equals: " + finalSpeed)
  }
}