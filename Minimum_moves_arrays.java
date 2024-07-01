public class Minimum_moves_arrays {
    public static int minMoves(int[] nums) {
                // int len = nums.length;
        // int count = 0;
        // Arrays.sort(nums);
        // int end = nums.length - 1;
        // Solution 1
        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i] == nums[i+1]){
        //         continue;
        //     }
        //     count += nums[len - 1] - nums[i];
        // }

        // Solution 2
        // while(nums[end] != nums[0]){
        //     int current_element = nums[end] - nums[0];
        //     count += current_element;
        //     nums[0] += current_element;
        //     end--;
        //     nums[end] += count;
        // }

        // Solution 3
        int min = nums[0];
        for(int num: nums) min = Math.min(min, num);
        int count = 0;
        for(int num : nums) count += num - min;
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(minMoves(nums));
    }
}
