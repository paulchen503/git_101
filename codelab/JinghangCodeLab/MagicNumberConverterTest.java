package JinghangCodeLab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MagicNumberConverterTest {
    @Test
    public void testConvertBinaryNumber() {
        MagicNumberConverter convert = new MagicNumberConverter();
                assertEquals(-10,convert.binaryToDecimal("-1010"));

        
    }
    
}
