class Solution {
    public int trap(int[] height) {
        if(height.length<3) return 0;
        int[] left= new int[height.length];
        int[] right= new int[height.length];
        int max=left[0]=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>height[max]) max=i;
            left[i]=max;
        }
        max=height.length-1;
        right[0]=max;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>height[max]) max=i;
            right[i]=max;
        }
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int level=Math.min(height[right[i]],height[left[i]]);
            trappedWater+= level-height[i];
        }
        return trappedWater;
    }
}