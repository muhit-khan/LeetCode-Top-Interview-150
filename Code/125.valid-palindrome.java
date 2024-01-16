/*
 * [125] Valid Palindrome
 */

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char charI = Character.toLowerCase(s.charAt(i));
            char charJ = Character.toLowerCase(s.charAt(j));

            if (!Character.isLetterOrDigit(charI)) {
                i++;
            } else if (!Character.isLetterOrDigit(charJ)) {
                j--;
            } else if (charI == charJ) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
