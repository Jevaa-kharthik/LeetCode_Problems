import java.util.Arrays;

public class Maximum_product {
    public static int maximumProd(int[] nums){
        int prod = 0;
        int len = nums.length;
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        prod = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int neg_prod = nums[0] * nums[1] * nums[len - 1];
        return Math.max(neg_prod, prod);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {-1,-2,-3,-4,-5};
        System.out.println(maximumProd(nums1));
        System.out.println(maximumProd(nums2));
    }
    
}
