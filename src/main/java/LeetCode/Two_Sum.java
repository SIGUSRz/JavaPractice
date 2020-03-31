package LeetCode;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (mp.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = mp.get(target - nums[i]);
                return result;
            }
            mp.put(nums[i], i);
        }
        return null;
    }
}
