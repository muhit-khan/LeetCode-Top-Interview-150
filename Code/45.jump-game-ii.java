/*
 * [45] Jump Game II
 */

class Solution {
    public int jump(int[] nums) {
        int maxReach = 0, nJump = 0, current = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
            if (i == current) {
                current = maxReach;
                nJump++;
            }
        }
        return nJump;
    }
}