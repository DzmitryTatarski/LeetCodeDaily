package task0x.task4;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
            return median(nums2);
        else if (nums2.length == 0)
            return median(nums1);

        int[] mergedArray = mergeArrays(nums1, nums2);
        return median(mergedArray);
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }

    private double median(int[] mergedArray) {
        int mid = mergedArray.length / 2;

        return mergedArray.length % 2 == 1
                ? mergedArray[mid]
                : (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
    }
}
