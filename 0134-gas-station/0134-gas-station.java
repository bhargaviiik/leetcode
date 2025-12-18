class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        for (int start = 0; start < n; start++) {
            int tank = 0;
            int stationsCovered = 0;
            int i = start;

            // Try to complete a full circle
            while (stationsCovered < n) {
                tank += gas[i] - cost[i];

                if (tank < 0)
                    break; // can't continue from this start

                i = (i + 1) % n;
                stationsCovered++;
            }

            if (stationsCovered == n && tank >= 0)
                return start; // success
        }

        return -1; // no possible start
    }
}