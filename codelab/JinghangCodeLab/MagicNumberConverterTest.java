package JinghangCodeLab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MagicNumberConverterTest {
    @Test
    public void testConvertBinaryNumber() {
        MagicNumberConverter convert = new MagicNumberConverter();
        assertEquals(0, convert.binaryToDecimal("11111111111111111111111111111111111111111111111111"));
        assertEquals(10, convert.binaryToDecimal("1010"));
        assertEquals(0, convert.binaryToDecimal("0"));
    }

    @Test
    public void testNegative() {
        MagicNumberConverter convert = new MagicNumberConverter();
        assertEquals(-10, convert.binaryToDecimal("-1010"));
    }
    
    @Test
    public void testDecimal() {
        MagicNumberConverter convert = new MagicNumberConverter();
        assertEquals(0, convert.binaryToDecimal("0.1010001"));

    }
    
}
