object TwoArray {
    def twoArrays(c: Array[Int], b: Array[Int]): String = {
      if (c.length > b.length)
        return ("Array 1 is greater than Array 2")
      else
        return ("Array 2 is greater than Array 1")
    }

    def main(args: Array[String]): Unit = {

      var array1 = Array[Int](10, 20, 30, 40, 50)
      var array2 = Array[Int](10, 20, 30, 40)

      println(s"Comparing Array1 and Array2, ${twoArrays(array1, array2)}")
    }


}
