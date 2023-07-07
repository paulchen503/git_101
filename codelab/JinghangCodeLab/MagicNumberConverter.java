package JinghangCodeLab;

public class MagicNumberConverter {

    public static int binaryToDecimal(String binary) {
        if (Double.parseDouble(binary) > Integer.MAX_VALUE){
            System.out.println("Out of Range not in Integer Range");
            return 0;
        }
        // Edge cases
        if (binary == "0") {
            return 0;
        }

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '.') {
                System.out.println("Cannot Input Decimals");
                return 0;
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
