import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> paren = new ArrayList<>();
        helper(paren, 0, 0, "", n);
        return paren;

    }
    private void helper(List<String> ans, int left, int right, String s, int n){
        if(s.length() == n * 2){
            ans.add(s);
            return;
        }
        if(left < n){
            helper(ans, left + 1, right, s + "(", n);
        }
        if(right < left){
            helper(ans, left, right + 1, s + ")", n);
        }

    }
}
