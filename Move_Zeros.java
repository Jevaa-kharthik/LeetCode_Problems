import java.util.Arrays;

public class Move_Zeros {
    public static void moveZero(int[] nums){
        int length = nums.length;
        int count = 0;

        for(int i=0;i<length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i=count; i < length; i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZero(nums);

    }
    
}
