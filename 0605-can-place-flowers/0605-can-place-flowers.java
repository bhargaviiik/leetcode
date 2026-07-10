class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len= flowerbed.length;
        if(n==0) return true;
        if(flowerbed[0]!=1){
            if(len>1 && flowerbed[1]!=1){
                n--;
                flowerbed[0]=1;
            }
            else if(len==1){
                flowerbed[0]=1;
                n--;
            }
        }
        for(int i=1;n>0 && i<len-1;i++){
            if(flowerbed[i]!=1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                n--;
            }
        }
        if(len>1 && flowerbed[len-2]!=1 && flowerbed[len-1]!=1) n--;
        return n<=0;
    }
}