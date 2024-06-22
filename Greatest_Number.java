import java.util.ArrayList;
import java.util.List;

public class Greatest_Number {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list1 = new ArrayList<>();
        for(int i=0;i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length; i++){
            if(candies[i] + extraCandies > max){
                list1.add(true);
            }
            else list1.add(false);
        }
        return list1;
    }
    public static void main(String[] args) {
        
    }
}
