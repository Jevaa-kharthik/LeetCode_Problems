import java.util.Arrays;

public class Sort_Color {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if(nums[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        // int index = 0;
        for(int i = 0; i < zero; i++){
            nums[i] = 0;
        }
        for(int i = zero; i < zero + one; i++){
            nums[i] = 1;
        }
        for(int i = zero + one; i < zero + one + two; i++){
            nums[i] = 2;
        }
    }
    public static void main(String[] args) {
        Sort_Color sc = new Sort_Color();
        int[] arr = {2, 0, 2, 1, 1, 0};
        sc.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
