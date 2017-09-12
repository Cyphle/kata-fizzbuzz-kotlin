import org.junit.Assert
import org.junit.Test

class TestStart {
    @Test fun testOk() {
        Assert.assertEquals("OK", start())
    }

    @Test fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
}