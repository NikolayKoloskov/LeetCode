package Practicum;

import java.util.Arrays;

/**
 * #27. Remove Element EASY https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {2, 0, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = removeElement.removeElement(nums, val);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
