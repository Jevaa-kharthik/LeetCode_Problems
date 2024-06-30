import java.util.HashMap;

public class Duplicate_Number {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> smap = new HashMap<>();
        for (int num : nums) {
            if (smap.containsKey(num)) {
                // Increment the count of the number if it's already in the map
                smap.put(num, smap.get(num) + 1);
            } else {
                // Otherwise, add the number to the map with a count of 1
                smap.put(num, 1);
            }
        }
        
        // Iterate through the map to find the first number with a count greater than 1
        for (int num : nums) {
            if (smap.get(num) > 1) {
                return num;
            }
        }
        
        // If no duplicate is found, return -1 or throw an exception
        return -1;
    }
    
}
