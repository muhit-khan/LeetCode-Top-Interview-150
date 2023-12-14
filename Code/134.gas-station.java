/*
 * [134] Gas Station
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int temp = 0;
        int g = gas[start];
        int flag = 0;

        for (int i = 0; i < n; i++) {
            g = g - cost[i];
            temp += g;

            if (g < 0) {
                start = i + 1;
                g = gas[start];
                flag++;
            }
        }

        return (temp < 0 || flag == n) ? -1 : start;
    }
}