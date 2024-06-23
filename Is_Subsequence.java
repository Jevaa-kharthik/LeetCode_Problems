public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t){
        if(s.length() == 0){
            return true;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int count = 0;
        for(int i=0; i < t.length(); i++){
            if(ss[count] == tt[i]){
                count++;
                if(count == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
