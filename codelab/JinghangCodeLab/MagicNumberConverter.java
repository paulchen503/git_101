package JinghangCodeLab;

public class MagicNumberConverter {

    public static int binaryToDecimal(String binary) throws Exception {
        if (Double.parseDouble(binary) > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Out of Range");

        }
        // Edge cases
        if (binary == "0") {
            return 0;
        }

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '.') {
                throw new IllegalArgumentException("Cannot input Decimals");
            }
        }

        // Negative check
        boolean isNegative;
        if (binary.charAt(0) == '-') {
            isNegative = true;
        } else {
            isNegative = false;
        }

        // Formula
        int length = binary.length() - 1;
        int multiple = 1;
        int sum = 0;
        int subtractIfNegative;

        if(isNegative == true){
            subtractIfNegative = 0;
        } else{
            subtractIfNegative = -1;
        }
        
        for (int i = length; i > subtractIfNegative; i--) {
            int num = Character.getNumericValue(binary.charAt(i));
            int val = multiple * num;
            sum += val;
            multiple *= 2;
        }

        if (isNegative == true) {
            return -sum;
        }

        return sum;
    }
}
