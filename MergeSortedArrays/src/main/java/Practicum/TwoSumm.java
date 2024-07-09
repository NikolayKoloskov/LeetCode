package Practicum;

/**
 * #1. Two Sum EASY https://leetcode.com/problems/two-sum/
 */
public class TwoSumm {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i =0; i < (nums.length -1); i++){
            for(int k=0; k < nums.length; k++){
                if (i != k){
                    if(((nums[i]+ nums[k] )== target)){
                        return result = new int[] {i,k};
                    }
                }
            }
        }
        return result;
    }
}
