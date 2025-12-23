class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] arr= new StringBuilder[numRows];
        boolean down=true;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder();
        }
        for(int i=0;i<s.length();i++){
            if(down) row++;
            else row--;
            char curr= s.charAt(i);
            arr[row].append(curr);
            if(row==numRows-1) down=false;
            else if(row==0) down= true;
        }
        StringBuilder ans= new StringBuilder(arr[0]);
        for(int i=1;i<arr.length;i++) ans.append(arr[i]);
        return ans.toString();
    }
}