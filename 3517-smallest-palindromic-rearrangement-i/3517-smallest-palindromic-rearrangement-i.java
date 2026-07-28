class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder ans = new StringBuilder("");
        int n=s.length();
        for(int i=0;i<n/2;i++){
            char c=s.charAt(i);
            int l=0, r=ans.length()-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                char curr= ans.charAt(mid);
                if(curr>c) r=mid-1;
                else l=mid+1;
            }
            ans.insert(l,c);
        }
        StringBuilder dum= new StringBuilder(ans);
        String end= dum.reverse().toString();
        ans.append(end);
        if(n%2!=0) ans.insert(n/2,s.charAt(n/2));
        return ans.toString();
    }
} 