import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse_Vowel {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int start = 0;
        int end = arr.length;

        while(start > end){
            if(!vowels.contains(arr[start])) start++;
            else if(!vowels.contains(arr[end])) end--;
            else if(vowels.contains(arr[start]) && vowels.contains(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
