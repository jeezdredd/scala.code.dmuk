object TestFunction {
def intDecorator(x: Int, f: Int => String) = f(x)

def main(args: Array[String]): Unit = {
  

var result = intDecorator(5, (y: Int) => "{" + y + "}")
}
}
