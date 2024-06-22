public class Reverse_word{
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
            if(i>0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
}