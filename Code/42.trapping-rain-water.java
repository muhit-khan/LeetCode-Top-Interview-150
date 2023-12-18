/*
 * [42] Trapping Rain Water
 */

class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int peak = left[0];
        for (int i = 0; i < left.length; i++) {
            peak = Math.max(peak, left[i]);
            left[i] = peak;
        }
        peak = right[0];
        for (int i = right.length - 1; i > 0; i--) {
            peak = Math.max(peak, right[i]);
            right[i] = peak;
        }
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            totalWater += Math.min(left[i], right[i]) - height[i];
        }
        return totalWater;
    }
}