package Practicum;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length >= 1 && nums2.length >= 1){
            Set<Integer> set1 = HashSet.newHashSet(nums1.length);
            Set<Integer> set2 = HashSet.newHashSet(nums2.length);
            for (int j : nums1) {
                set1.add(j);
            }
            for (int j : nums2) {
                set2.add(j);
            }
            set1.retainAll(set2);
            int i = 0;
            int[] resultInt = new int[set1.size()];
            for (Integer x : set1)
                resultInt[i++] = x;
            return resultInt;
        }
        if (nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        else return new int[0];

    }
}
