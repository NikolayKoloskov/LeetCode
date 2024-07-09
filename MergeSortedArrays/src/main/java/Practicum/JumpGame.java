package Practicum;

/**
 * 55. Jump Game MEDIUM https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {1,1,2,2,0,1,1};
        System.out.println(jumpGame.canJump(nums));
    }
}
