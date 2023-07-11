package task0x.task1;

import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int num;
        for (int i = 0; i < nums.length; i++) {
            num = target - nums[i];
            if (map.containsKey(num))
                return new int[]{map.get(num), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
