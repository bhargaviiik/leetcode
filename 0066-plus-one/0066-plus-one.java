class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            int dig= sum%10;
            carry=sum/10;
            list.add(0,dig);
        }
        if(carry!=0) list.add(0,carry);
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}