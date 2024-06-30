import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Remove_duplicate{
    public List<Integer> findDupli(int[] nums){
        HashMap<Integer, Integer> smap = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(smap.containsKey(nums[i])){
                smap.put(nums[i], smap.get(nums[i] + 1));
            }
            else{
                smap.put(nums[i], 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(smap.get(nums[i]) > 1){
                lst.add(nums[i]);
            }
        }
        return lst;
    }
}