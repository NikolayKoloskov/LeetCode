package Practicum;

/**
 * 88. Merge Sorted Array https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }


    public static void main(String args[]) {


        MergeSortedArray object = new MergeSortedArray();
      object.merge(new int[]{1, 2, 3, 6, 8, 0, 0, 0, 0, 0}, 5, new int[]{1, 4, 6, 8, 9}, 5);

    }

    static void print(int[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }
    }
}

