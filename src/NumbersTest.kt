import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * @author DT5Gen on 01/06/2024
 * TDD Test Driven Development
 */

class NumbersTest {

    @Test
    fun testSum() {



        val numbers: Numbers = Numbers.Base3(11, 5, 3)
        val actual = numbers.sum()
        val expected: Int = 19

        assertEquals(expected, actual)
    }

    @Test
    fun testDiff() {


        val numbers: Numbers = Numbers.Base3(20, 5, 4)
        val actual = numbers.different()
        val expected: Int = 11

        assertEquals(expected, actual)
    }

    @Test
    fun testDivideDouble() {


        val numbers: Numbers = Numbers.Base2(20, 5)
        val actual = numbers.divide()
        val expected: Double = 4.0

        assertEquals(expected, actual)
    }


}
