/*
 * [151] Reverse Words in a String
 */

class Solution {
    public String reverseWords(String s) {
        String[] array = s.trim().split("\\s+");

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return String.join(" ", array);
    }
}
