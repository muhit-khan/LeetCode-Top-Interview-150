/*
 * [58] Length of Last Word
 */

// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.split(" ");

//         if (words.length > 0) {
//             String lastWord = words[words.length - 1];
//             return lastWord.length();
//         } else {
//             return 0;
//         }
//     }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (s.charAt(i) == ' ') {
                break;
            }
        }
        return count;
    }
}