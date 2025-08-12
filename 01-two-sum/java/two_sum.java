

import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] brute = twoSumBruteForce(nums, target);
        int[] optimal = twoSumOptimal(nums, target);
        
        System.out.println("Brute Force");
        for(int b : brute){
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Optimal");
        for(int o : optimal){
            System.out.print(o+" ");
        }
        System.out.println();

    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("brute: "+i+" "+j);
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(visited.containsKey(remaining)){
                return new int[]{i, visited.get(remaining)};
            }
            visited.put(nums[i], i);
        }

        return new int[]{};
    }
}
