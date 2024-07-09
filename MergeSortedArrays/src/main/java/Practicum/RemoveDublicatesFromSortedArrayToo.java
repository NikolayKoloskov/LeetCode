package Practicum;

import java.util.Arrays;

/**
 * 80. Remove Duplicates from Sorted Array II. Medium https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDublicatesFromSortedArrayToo {
    public int removeDuplicates(int[] nums) {
        int i = 0, k = 0, j = 1, n = 0;
        for (i = 0; i < nums.length; i++) {
            if (i == nums.length  -  1){
                nums[k] = nums[i];
                k++;
                break;
            }
            if ((i+1< nums.length) & (nums[i] != nums[i + 1])) {
                nums[k] = nums[i];
                k++;
            }
            if (nums[i] == nums[i + 1]) {
                while ((i+j <nums.length) & (nums[i] == nums[i+j])) {
                    j++;
                    if (i+j == nums.length){
                        break;
                    }
                }
                nums[k] = nums[i];
                k++;
                nums[k] = nums[i];
                k++;
                i=i+j-1;
                j=1;
            }
            if (i >=nums.length){
                break;
            }
        }
        return  k;
    }
    public static void main(String[] args) {
        RemoveDublicatesFromSortedArrayToo RemoveDublicatesFromSortedArrayToo = new RemoveDublicatesFromSortedArrayToo();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = RemoveDublicatesFromSortedArrayToo.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
