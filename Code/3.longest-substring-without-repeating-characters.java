/*
 * [3] Longest Substring Without Repeating Characters
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = -1;
        int j = -1;
        int n = s.length();
        int length = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            // aqcuire
            while (i < n - 1) {
                f1 = true;
                i++;
                char ch = s.charAt(i);
                hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
                if (hmap.get(ch) > 1) {
                    break;
                }
                length = Math.max(length, hmap.size());
            }
            // release
            while (j < i && hmap.get(s.charAt(i)) > 1) {
                f2 = true;
                j++;
                char ch = s.charAt(j);
                if (hmap.get(ch) == 1) {
                    hmap.remove(ch);
                } else {
                    int f = hmap.get(ch);
                    hmap.remove(ch);
                    hmap.put(ch, f - 1);
                }
            }
            length = Math.max(length, hmap.size());
            if (f1 == false && f2 == false)
                break;
        }
        return length;
    }
}