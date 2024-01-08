import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * @author DT5Gen on 01/06/2024
 * TDD Test Driven Development
 */

class NumbersTest {

    @Test
    fun testSum() {

        // 12, 4
        // 16, sum 12 & 4

        val numbers: Numbers = Numbers.Base(11, 5)
        val actual = numbers.sum()
        val expected: Int = 16

        assertEquals(expected, actual)
    }

    @Test
    fun testDiff() {

        // 12, 4
        // 16, sum 12 & 4

        val numbers: Numbers = Numbers.Base(20, 5)
        val actual = numbers.different()
        val expected: Int = 15

        assertEquals(expected, actual)
    }


}
