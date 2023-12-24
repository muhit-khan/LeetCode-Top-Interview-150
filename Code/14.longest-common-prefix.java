/*
 * [14] Longest Common Prefix
 */

class Solution {
    public String longestCommonPrefix(String[] words) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(words);
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        for (int i = 0; i < Math.min(firstWord.length(), lastWord.length()); i++) {
            if (firstWord.charAt(i) != lastWord.charAt(i)) {
                return result.toString();
            }
            result.append(firstWord.charAt(i));
        }
        return result.toString();
    }
}