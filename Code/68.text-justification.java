/*
 * [68] Text Justification
 */

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i + 1;
            int lineLength = words[i].length();

            while (j < words.length && (lineLength + words[j].length() + (j - i - 1)) < maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder(words[i]);
            int spaceCount = j - i - 1;

            if (j == words.length || spaceCount == 0) {
                for (int k = i + 1; k < j; k++) {
                    line.append(" ").append(words[k]);
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spacesToAdd = (maxWidth - lineLength) / spaceCount;
                int extraSpaces = (maxWidth - lineLength) % spaceCount;

                for (int k = i + 1; k < j; k++) {
                    for (int s = 0; s < spacesToAdd; s++) {
                        line.append(" ");
                    }
                    if (extraSpaces > 0) {
                        line.append(" ");
                        extraSpaces--;
                    }
                    line.append(words[k]);
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
