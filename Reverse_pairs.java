import java.util.ArrayList;

public class Reverse_pairs {
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
   }
   private static int mergeSort(int[] nums, int start, int end){
    if(start >= end) return 0;
    int mid = (start + end) / 2;
    int inv = mergeSort(nums, start, mid);
    inv += mergeSort(nums, mid + 1, end);
    inv += merge(nums, start, mid, end);
    return inv;
    }
    private static int merge(int[] nums, int low, int mid, int high){
        int count = 0;
        int j = mid + 1;
        for(int i = low; i <= mid; i++){
            while(j <= high && nums[i] > 2 * (long)nums[j]) j++;
            count += j - (mid + 1);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }

        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right <= high){
            temp.add(nums[right++]);
        }

        for(int i = low; i <= high; i++){
            nums[i] = temp.get(i - low);
        }
        return count;
    }
        
            
        
}

        