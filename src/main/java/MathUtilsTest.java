import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testGcd() {
        assertEquals(2, MathUtils.gcd(2, 8));
        assertEquals(1, MathUtils.gcd(1, 8));
    }

    @Test
    public void testLcm() {
        assertEquals(16, MathUtils.lcm(16, 8));
    }
}
