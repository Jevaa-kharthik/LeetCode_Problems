import java.util.Arrays;

public class Longest_common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
       StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String two = strs[strs.length - 1];
        for(int i = 0; i < Math.min(first.length(), two.length()); i++){
            if(first.charAt(i) != two.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] nums = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(nums));
    }
}
