import java.util.ArrayDeque;
import java.util.Deque;

public class Basic_Caluculator {
    public static int basicCal(String s){
        Deque<Integer> stack = new ArrayDeque<>();
        char operation = '+';
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            char currentchar = s.charAt(i);
            if(Character.isDigit(currentchar)){
                value = value * 10 + (currentchar - '0');
            }
            if(i == s.length() - 1 || currentchar == '+' || currentchar == '-' || currentchar == '*' || currentchar == '/'){
                switch (operation) {
                    case '+':
                        stack.push(value);
                        break;
                    case '-':
                        stack.push(-value);
                        break;
                    case '*':
                        stack.push(stack.pop() * value);
                        break;
                    case '/':
                        stack.push(stack.pop() / value);

                }
                operation = currentchar;
                value = 0;
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(basicCal(s));
    }
}
