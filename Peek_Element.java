public class Peek_Element {
    public int findPeakElement(int[] nums) {
        int index = 0;
        int element = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                index = i;
                element = Math.max(element, nums[i]);
            }
        }
        return index;
    }
}
