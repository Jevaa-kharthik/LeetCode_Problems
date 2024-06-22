public class Special_array {
    public static boolean special(int[] nums){
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i]%2 == 0 && nums[i+1]%2 == 1){
                continue;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
    
}
