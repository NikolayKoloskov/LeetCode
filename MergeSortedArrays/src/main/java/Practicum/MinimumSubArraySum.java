package Practicum;

import java.util.Arrays;

public class MinimumSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int k = 0;
        int count = 0;
        int minCount = 0;
        int sum = 0;

        while (i < nums.length && k < nums.length) {
            if (sum == 0 && i == k) {
                sum = nums[i];
            }
            while (sum < target) {
                if (k + 1 < nums.length) {
                    k++;
                    sum += nums[k];
                }
                else if (i + 1 < nums.length){
                    i++;
                    sum -= nums[i];
                }
                else {
                    break;
                }
            }
            if (sum >= target) {
                count = k - i + 1;
                if (minCount == 0 || minCount > count) {
                    minCount = count;
                }
                sum -= nums[i];
                i++;
                continue;
            }
            if (i == k && i + 1 == nums.length){
                break;
            }
            if (sum < target && i == 0 && k +1 == nums.length) {
                return 0;
            }
        }
        return minCount;
    }
    public static void main(String[] args) {
        MinimumSubArraySum minimumSubArraySum = new MinimumSubArraySum();
        int[] nums = {1,1,1,1,7};
        int target = 7;
        System.out.println(minimumSubArraySum.minSubArrayLen(target, nums));
    }
}
