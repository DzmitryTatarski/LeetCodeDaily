package task1x.task15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1, r = n - 1;

                while(l < r) {
                    if(nums[l] + nums[r] == -1*nums[i])
                        set.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    if(nums[l] + nums[r] < -1*nums[i]) l++;
                    else r--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
