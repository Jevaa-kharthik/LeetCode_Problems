import java.util.HashMap;
import java.util.Map;

public class K_Pair_sums {
    public static int kPairSums(int[] nums, int k){
        Map<Integer, Integer> match = new HashMap<>();
        int count = 0;

        for(int num : nums){
            int complement = k - num;
            if(match.getOrDefault(complement, 0) > 0){
                count++;
                match.put(complement, match.get(complement) - 1);
            }
            else{
                match.put(num, match.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
