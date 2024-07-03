public class Split_array_sum {
    public static int splitArray(int[] nums, int k){
    //     if(nums.length == 0 || k == 0){
    //         return 0;
    //     }
    //     int start = 0;
    //     int end = nums.length - 1;
    //     int max = 0;
    //     while(start < end){
    //         int sum = 0;
    //         int diff = end - start;
    //         if(diff >= 3){
    //             sum = nums[start] + nums[start + 1] + nums[start + 2];
    //             max = Math.max(max, sum);
    //             start += 3;
    //         }
    //         else if(diff < 3){
    //             if(diff == 2){
    //                 sum = nums[start] + nums[start + 1];
    //                 max = Math.max(max, sum);
    //                 break;

    //             }
    //             else{
    //                 max = Math.max(max, nums[start]);
    //                 break;
    //             }
    //         }
    //     }
    //     return max;
    // }
        // return max;
        // int start = 0;
        // int end = nums.length - 1;
        // int sum_start = 0;
        // int sum_end = 0;
        // int max = 0;
        // while(start < end){
        //     int len = end - start;
        //     if(len > 0){
        //         sum_start += nums[start];
        //         sum_end += nums[end];
        //         start++;
        //         end--;
        //     }
        //     else if(len == 0){
        //         int temp_left = sum_start + nums[start];
        //         int temp_right = sum_end + nums[end];
        //         if(temp_left < sum_end){
        //             return sum_end;
        //         }
        //         else if(temp_left > sum_end){
        //             return temp_left;
        //         }
        //         else if(temp_right < sum_start){
        //             return sum_start;
        //         }
        //         else{
        //             return temp_right;
        //         }
        //     }
        // }
        // return max;

    //     int maxElement = 0;
    //     int sum = 0;
        
    //     for(int num : nums){
    //         maxElement = Math.max(maxElement, num);
    //         sum += num;
    //     }

    //     int start = maxElement;
    //     int end = sum;

    //     while(start < end){
    //         int mid = start + ((end - start) / 2);
    //         if(canSplit(nums, k, mid)){
    //             end = mid;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     } 
    //     return start;
    // }

    // private static boolean canSplit(int nums[], int k, int mid){
    //     int currentSum = 0;
    //     int subarray = 0;
    //     for(int num : nums){
    //         if(currentSum + num > mid){
    //             currentSum = num;
    //             subarray++;
    //             if(subarray > k) return false;
    //         }
    //         currentSum += num;
    //     }
    //     return true;
    // }
    int maxElement = 0;
        int sum = 0;
        
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            sum += num;
        }
        
        int left = maxElement;
        int right = sum;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int currentSum = 0;
        int subarrays = 1;
        
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                currentSum = num;
                subarrays++;
                if (subarrays > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
