package task1x.task15;

import java.util.*;

public class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList <List<Integer>>() {
            public List<Integer> get(int index) {
                initialize();
                return res.get(index);
            }

            public int size() {
                initialize();
                return res.size();
            }

            private void initialize() {
                if (res != null) return;
                Arrays.sort(nums);
                res = new ArrayList<>();

                for (int i = 0; i < nums.length; i++) {
                    if (i != 0 && nums[i] == nums[i - 1])
                        continue;
                    int j = i + 1;
                    int k = nums.length - 1;

                    while (j < k) {
                        int sum = nums[i] + nums[j] + nums[k];
                        if (sum == 0) {
                            res.add(new Solution.Triple(nums[i], nums[j], nums[k]));
                            j++;
                            k--;
                            while (j < k && nums[j] == nums[j - 1]) j++;
                            while (j < k && nums[k] == nums[k + 1]) k--;
                        } else if (sum < 0) {
                            j++;
                        } else {
                            k--;
                        }
                    }
                }

            }
        };
    }

    public static class Triple extends AbstractList < Integer > {
        private int[] data;

        public Triple(int i, int j, int k) {
            data = new int[] {i,j,k};
        }

        public Integer get(int index) {
            return data[index];
        }

        public int size() {
            return 3;
        }
    }
}
