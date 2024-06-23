public class Most_water {
    public static int mostWater(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int max_area = 0;
        while(start < end){
            int width = end - start;
            int min_height = Math.min(nums[start], nums[end]);

            int current_area = min_height * width;

            max_area = Math.max(max_area, current_area);

            if(nums[start] < nums[end]){
                start++;
            }
            else end--;
        }
        return max_area;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(nums));
    }
    
}
