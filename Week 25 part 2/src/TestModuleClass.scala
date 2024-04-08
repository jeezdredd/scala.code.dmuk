import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import ArgumentTest._

class TestModuleMarks {

  @Test def testFail(): Unit = {
    assertEquals("20 from {0..39}", Fail, getClassification(20))
  }

  @Test def testThird(): Unit = {
    assertEquals("45 from {40..49}", Third, getClassification(45))
  }

  @Test (expected = classOf[IllegalArgumentException]) def testIllegalNegative(): Unit = {
    getClassification(-5)
  }

}
