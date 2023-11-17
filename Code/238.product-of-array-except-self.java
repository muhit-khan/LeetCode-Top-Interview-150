/*
 * [238] Product of Array Except Self
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd = new int[n], rightProd = new int[n], product = new int[n];

        leftProd[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProd[i] = leftProd[i - 1] * nums[i - 1];
        }

        rightProd[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProd[i] = rightProd[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = leftProd[i] * rightProd[i];
        }

        return product;
    }
}