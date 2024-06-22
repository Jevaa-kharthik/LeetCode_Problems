public class Merge_Strings_Alternativily{
    public String merge_string(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word1.length() || i<word2.length(); i++){
            
        }
        return sb.toString();
    }
    //     String result = "";
    //     if(word1.length() == word2.length()){
    //         for(int i=0;i < word1.length(); i++){
    //             result += word1.charAt(i);
    //             result += word2.charAt(i);
    //         }
    //     }
    //     else if(word1.length() != word2.length()) {
    //         if(word1.length() < word2.length()){
    //             return alternate_one(word1, word2);
    //         }
    //         else if(word1.length() > word2.length()){
    //             return alternate_two(word1, word2);
    //         }
    //     }
    //     return result;
    // }

    // public String alternate_one(String word1, String word2){
    //     String result = "";
    //     for(int i=0; i<word1.length(); i++){
    //         result += word1.charAt(i);
    //         result += word2.charAt(i);
    //     }
    //     result += word2.substring(word1.length());
    //     return result;
    // }

    // public String alternate_two(String word1, String word2){
    //     String result = "";
    //     for(int i=0; i<word2.length(); i++){
    //         result += word1.charAt(i);
    //         result += word2.charAt(i);
    //     }
    //     result += word2.substring(word2.length());
    //     return result;

    // }
    public static void main(String[] args) {
        
    }

}