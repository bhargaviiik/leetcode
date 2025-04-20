class Solution {
    public int maxArea(int[] height) {
        int max= Integer.MIN_VALUE;
        int n = height.length;
        int si=0;
        int ei=n-1;
        int width;
        int hei;
        int water;
        while(si!=ei){
            width=ei-si;
            hei=Math.min(height[si],height[ei]);
            water=hei*width;
            max= Math.max(max,water);
            if(height[si]<height[ei]){
                si++;
            }else{
                ei--;
            }
        }
        return max;
    }
}