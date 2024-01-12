import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * @author DT5Gen on 01/09/2024
 * TDD Test Driven Development
 */

class FormulaTest {

    @Test
    fun testSum() {



        val carFullPrice: NinjaCarValue.BaseUntil3to5 = NinjaCarValue.BaseUntil3to5(
            600000,
            1000,
            60000,
            80000,
            5200,
            20000,
            30000,
            5000,
            0,
            10000,
            0,
            7000,
            40000,
            20000,
            0,
            0,
            0,
            1.5F,
            0,
            0,
            0

            )

        carFullPrice.sumJapanMoney()
        carFullPrice.sumRussianMoney()

        val actual = carFullPrice.sumFinalMoney()
        val expected: Double = 748444.75

        assertEquals(expected, actual )
    }

    @Test
    fun testDiff() {


        val numbers: Numbers = Numbers.Base3(20, 5, 4)
        val actual = numbers.different()
        val expected: Int = 11

        assertEquals(expected, actual)
    }


}
