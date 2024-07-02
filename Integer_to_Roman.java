public class Integer_to_Roman {
    public static String integerRoman(int num){
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X" ,"IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < roman.length; i++){
            while(num >= nums[i]){
                sb.append(roman[i]);
                num = num - nums[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(integerRoman(3749));
        
    }
    
}
