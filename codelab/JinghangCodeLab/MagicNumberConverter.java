package JinghangCodeLab;

public class MagicNumberConverter {

    public static int binaryToDecimal(String binary)
    {  
        //edge cases
        if (binary == "0"){
            return 0;
        }

        //negative
        int isNegative = -1;
        if(Integer.parseInt(binary) < 0){
            isNegative = 0;
        }
        else{
            isNegative = -1;
        }
        //formula
        int length =  binary.length() - 1;
        int multiple = 1;
        int sum = 0;
        for (int i = length; i > isNegative; i--){
            char place = binary.charAt(i);
            int num = Character.getNumericValue(place);
            int val = multiple * num;
            sum += val;
            multiple *= 2;
        }
        if(isNegative == 0){
            return sum*-1;
        }


        
    
        return sum;
    }
    
}