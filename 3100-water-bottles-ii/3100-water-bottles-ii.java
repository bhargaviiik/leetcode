class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk;
        int empty=0;
        while(numBottles>=numExchange){
            numBottles-=numExchange;
            empty+=numExchange;
            numExchange++;
            numBottles++;
        }
        bottlesDrunk=empty+numBottles;
        return bottlesDrunk;
    }
}