/*
 * [55] Jump Game
 */

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
}
