class Solution {
    public int candy(int[] ratings) {
        if(ratings.length<2) return 1;
        int[] ans= new int[ratings.length];
        int total=0;
        Arrays.fill(ans,1);
        if(ratings[0]>ratings[1]) ans[0]++;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1] && ans[i]<=ans[i-1]) ans[i]=ans[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && ans[i]<=ans[i+1]) ans[i]=ans[i+1]+1;
        }
        for(int i=0;i<ans.length;i++) total+=ans[i];
        return total;
    }
}