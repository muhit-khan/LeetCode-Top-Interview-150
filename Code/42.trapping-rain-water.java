class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        int peak = height[0];
        for (int i = 0; i < n; i++) {
            peak = Math.max(peak, height[i]);
            left[i] = peak;
        }

        peak = height[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            peak = Math.max(peak, height[i]);
            right[i] = peak;
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(left[i], right[i]) - height[i];
        }

        return totalWater;
    }
}
