package Practicum;

import java.util.Arrays;

/**
 *  45. Jump Game II MEDIUM https://leetcode.com/problems/jump-game-ii/description/
 */
public class CanJumpTwo {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        CanJumpTwo canJumpTwo = new CanJumpTwo();
        int[] nums = {2,1,1,1,1};
        System.out.println(canJumpTwo.jump(nums));
    }
}
