package task1x.task16;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - result))
                    result = sum;
                if (sum > target){
                    right--;
                }else if (sum < target)
                    left++;
                else
                    return result;
            }
        }
        return result;
    }
}
