import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer> > matrix = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums.length < 3) return matrix;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right  = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    matrix.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return matrix;
    }
    
}
