/*
 * [80] Remove Duplicates from Sorted Array II
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int uniqueIndex = 2; // Start from the third element
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 2]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}