import java.util.HashMap;

public class Majority_element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> major = new HashMap<>();
        int max = 0;
        int element = 0;
        for(int num : nums){
            major.put(num, major.getOrDefault(num, 0) + 1);
            if(major.get(num) > max){
                max = major.get(num);
                element = num;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
