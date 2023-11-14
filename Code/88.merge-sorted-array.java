/*
 * [88] Merge Sorted Array
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums11 = new int[m];
        for (int i = 0; i < m; i++) {
            nums11[i] = nums1[i];
        }
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums11[i] < nums2[j]) {
                nums1[k++] = nums11[i++];
            }
            else {
                nums1[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums1[k++] = nums11[i++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}