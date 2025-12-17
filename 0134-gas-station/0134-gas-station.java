class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++){
            int tank=gas[i]-cost[i];
            if(tank<0) continue; //cannot be the starting index
            int j=(i+1)%n;
            tank+=gas[j];
            while(tank>=cost[j] && j!=i){
                tank=tank-cost[j];
                j=(j+1)%n;
                tank+=gas[j];
            }
            if(j==i) return i;
        }
        return -1;
    }
}