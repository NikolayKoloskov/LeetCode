package Practicum;

import java.util.Arrays;

/**
 * #26. Remove Duplicates from Sorted Array EASY  https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDublicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                nums[j] = nums[i];
                j++;
                break;
            }
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDublicatesFromSortedArray removeDublicatesFromSortedArray = new RemoveDublicatesFromSortedArray();
        int[] nums = {1,1,2};
        int result = removeDublicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
