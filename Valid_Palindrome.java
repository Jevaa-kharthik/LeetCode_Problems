public class Valid_Palindrome {
    public static boolean validPalindrome(String s) {
        // int start = 0;
        // int end = s.length() - 1;
        // int count = 0;
        // while(start < end){
        //     if(s.length() % 2 == 0){
        //         if(s.charAt(start) == s.charAt(end)){
        //             count += 2;
        //             start++;
        //             end--;
        //             if(s.length() - count <= 2){
        //                 return true;
        //             }
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         if(s.charAt(start) == s.charAt(end)){
        //             count += 2;
        //             start++;
        //             end--;
        //             if(s.length() - 1 == count){
        //                 return true;
        //             }
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }
        // return false;
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }
    private static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String nums1 = "abca";
        String nums2 = "aba";
        String nums3 = "abc";
        System.out.println(validPalindrome(nums1));
        System.out.println(validPalindrome(nums2));
        System.out.println(validPalindrome(nums3));
    }
    
}
