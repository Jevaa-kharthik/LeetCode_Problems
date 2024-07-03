import java.util.ArrayList;
import java.util.List;

public class Count_Smaller_num {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> list_count = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[nums.length - 1]) continue;
                else if(nums[i] > nums[j]) count++;
            }
            list_count.add(count);
        }
        return list_count;  
    }
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums));
    }
}
