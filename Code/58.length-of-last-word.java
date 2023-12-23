/*
 * [58] Length of Last Word
 */

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        if (words.length > 0) {
            String lastWord = words[words.length - 1];
            return lastWord.length();
        } else {
            return 0;
        }
    }
}
