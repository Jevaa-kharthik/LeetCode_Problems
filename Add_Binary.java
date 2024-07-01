public class Add_Binary {
    public static String addBinary(String a, String b) {
        // int num1 = Integer.parseInt(a, 2);
        // int num2 = Integer.parseInt(b, 2);
        // while (num2 != 0){
        //     int sum = num1 ^ num2;
        //     int carry = (num1 & num2) << 1;
        //     num1 = sum;
        //     num2 = carry;

        // }
        // return Integer.toBinaryString(num1);
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry == 1){
            sum = carry;
            if(i >= 0) sum = sum + a.charAt(i)-'0';
            if(j >= 0) sum = sum + b.charAt(j)-'0';
            sb.append((char) (sum%2+'0'));
            carry = sum / 2;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
