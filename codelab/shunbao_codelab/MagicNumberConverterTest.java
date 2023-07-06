package shunbao_codelab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MagicNumberConverterTest {
    @Test
    public void testConvertBinaryNumber() {
        MagicNumberConverter convert = new MagicNumberConverter();
        int result = convert.binaryToDecimal("0");
        assertEquals(0, result);

        assertEquals(3, convert.binaryToDecimal("11"));
    }
}
