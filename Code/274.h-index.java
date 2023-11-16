/*
 * [274] H-Index
 */

class Solution {
    public int hIndex(int[] citations) {
        int hi = 0;
        Arrays.sort(citations);
        for (int i = citations.length -1, j = 1; i >= 0; i--, j++) {
            if (citations[i] >= j && j > hi) {
                hi = j;
            }
        }
        return hi;
    }
}