public class String_compress {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        int length = chars.length;

        while(read < length){
            char current_char = chars[read];
            int count = 0;

            while( read < length && chars[read] == current_char){
                read++;
                count++;
            }

            chars[write++] = current_char;

            if(count >= 2){
                String count_str = Integer.toString(count);
                for(char c : count_str.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
    public static void main(String[] args) {
        
    }
    
}
