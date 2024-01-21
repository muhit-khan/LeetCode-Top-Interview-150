/*
 * [11] Container With Most Water
 */

class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxCap = 0;
        while (i < j) {
            int min = i < j ? i : j;
            int cap = min * (j - i);
            if (cap > maxCap) {
                maxCap = cap;
            }
            if (height[i] < height[j]) {
                i++;
            } else if (height[j] < height[i]) {
                j--;
            }
        }
        return maxCap;
    }
}