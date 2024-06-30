import java.util.HashMap;
import java.util.Stack;

public class Valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();

        HashMap<Character, Character> match = new HashMap<>();
        match.put('(', ')');
        match.put('{', '}');
        match.put('[', ']');

        for(char c : s.toCharArray()){
            if(match.containsKey(c)){
                // char top = sta.isEmpty() ? '#' : sta.pop();
                char top = sta.isEmpty() ? '#' : sta.pop();
                if (top != match.get(c)){
                    return false;
                }
                else{
                    sta.push(c);
                }
            }
        }
        return sta.isEmpty();
    }
}
