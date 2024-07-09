package Practicum;

/**
 * 189. Rotate Array MEDIUM https://leetcode.com/problems/rotate-array/description/
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums != null || nums.length > 0) {
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                temp[(i + k) % nums.length] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = temp[i];
            }
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
