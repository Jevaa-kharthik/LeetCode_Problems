public class Valid_Number {
    public static boolean validNumber(String s){
        int len = s.length();
        int index = 0;
        if(s.charAt(index) == '+' || s.charAt(index) == '-'){
            index++;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                continue;
            }
            else if(Character.isAlphabetic(s.charAt(i)) || ((index == 1 && s.charAt(i) == '+') || (index == 1 && s.charAt(i) == '-'))){
                return false;
            }
        }
        if(index == len){
            return false;
        }

        if(s.charAt(index) == '.' && (index + 1 == len || s.charAt(index + 1) == 'e' || s.charAt(index + 1) == 'E')){
            return false;
        }

        int dot_count = 0;
        int E_count = 0;

        for(int i = index; i < s.length(); i++){
            char currentchar = s.charAt(i);
            if(currentchar == '.'){
                if(dot_count > 0 || E_count > 0){
                    return false;
                }
                dot_count++;
            }
            else if(currentchar == 'e' || currentchar == 'E'){
                if(E_count > 0 || i == index || i == len - 1){
                    return false;
                }
                E_count++;
                if(s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-'){
                    if(++i == len - 1){
                        return false;
                    }
                }
            }
            else if(currentchar < '0' && currentchar > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "+++";
        System.out.println(validNumber(s));
    }
}
