import org.junit.Assert
import org.junit.Test

object TestJunit {

  class MyFirstTest {
    @Test def firstTest(): Unit = {
      Assert.assertTrue(true)
    }
  }
}
