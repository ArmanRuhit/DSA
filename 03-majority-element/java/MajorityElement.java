import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println("HashMap: " + majorityElementHashMap(nums));
        System.out.println("Sorting: " + majorityElementSorting(nums));
    }
    
    static int majorityElementHashMap(int[] nums) {
        if (nums.length == 0)
            return 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        for (int key : countMap.keySet()) {
            if (countMap.get(key) > nums.length / 2) {
                return key;
            }
        }

        return 0;
    }
    
    static int majorityElementSorting(int[] nums) {
        
        Arrays.sort(nums);
        
        return nums[nums.length % 2 == 0 ? nums.length/2 : nums.length / 2 + 1];
    }
}
