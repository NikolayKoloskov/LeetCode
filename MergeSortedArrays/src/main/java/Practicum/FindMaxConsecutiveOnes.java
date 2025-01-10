package Practicum;
/*
https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=aqw21527
 */
public class FindMaxConsecutiveOnes{
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                current++;
                if (current > max) {
                    max = current;
                }
            }
            else {
                current = 0;
            }
        }
        return max;
    }
}