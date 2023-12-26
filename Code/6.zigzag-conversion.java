/*
 * [6] Zigzag Conversion
 */

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int direction = -1;
        int row = 0;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) {
                direction *= -1;
            }
            row += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder rowStr : rows) {
            result.append(rowStr);
        }

        return result.toString();
    }
}
