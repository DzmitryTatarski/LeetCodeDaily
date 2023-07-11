package task1x.task11;

public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int h = Math.min(height[left], height[right]);
            if (maxArea < h * (right - left))
                maxArea = h * (right - left);
            if (height[left] < height[right]){
                left++;
            }else
                right--;
        }
        return maxArea;
    }
}
