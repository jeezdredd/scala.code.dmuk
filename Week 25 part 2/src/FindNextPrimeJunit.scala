import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import FindNextPrime._

class FindNextPrimeJunit {

    @Test def testIsPrime1(): Unit = {
      assertFalse("Negative numbers are not prime", isPrime(-5))
    }

    @Test def testIsPrime2(): Unit = {
      assertFalse("0 is not prime", isPrime(0))
    }

    @Test def testIsPrime3(): Unit = {
      assertFalse("1 is not prime", isPrime(1))
    }

    @Test def testIsPrime4(): Unit = {
      assertTrue("2 is the lowest prime", isPrime(2))
    }

    @Test def testIsPrime5(): Unit = {
      assertTrue("3 is prime", isPrime(3))
    }

    @Test def testIsPrime6(): Unit = {
      assertFalse("4 is not prime", isPrime(4))
    }
}
