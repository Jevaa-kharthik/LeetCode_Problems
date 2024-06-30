import java.util.HashMap;

public class Subarray_sum_equal {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> smap = new HashMap<>();
        smap.put(0, 1);

        for(int num : nums){
            sum += num;
            if(smap.containsKey(sum - k)){
                count += smap.get(sum - k);
            }
            smap.put(sum, smap.getOrDefault(sum,0)+1);
        }
        return count;
    }
    
}
