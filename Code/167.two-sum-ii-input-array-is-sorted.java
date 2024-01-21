/*
 * [167] Two Sum II - Input Array Is Sorted
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = 1;
        while (i < numbers.length) {
            if (j == numbers.length) {
                i++;
                j = i + 1;
            } else if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else {
                j++;
            }
        }
        return new int[] { -1, -1 };
    }
}
