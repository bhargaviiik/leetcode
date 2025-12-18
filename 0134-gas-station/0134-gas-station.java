class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int prefixDiff=0, minIdx=0,  minPrefix=100000;
        for(int i=0;i<gas.length;i++){
            prefixDiff+= gas[i]-cost[i];
            if(minPrefix>prefixDiff){
                minPrefix= prefixDiff;
                minIdx=i;
            }
        }
        if(prefixDiff<0) return -1;
        return (minIdx+1)%gas.length;
    }
}