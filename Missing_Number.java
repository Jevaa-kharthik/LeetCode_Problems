import java.util.Arrays;

public class Missing_Number {
    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums[nums.length - 1] + 1;
    }
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums1));
        System.err.println(missingNumber(nums2));
        System.err.println(missingNumber(nums3));
    }
}
