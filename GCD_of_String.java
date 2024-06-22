public class GCD_of_String {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}
