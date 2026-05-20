class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        int[] ans= new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            int a=A[i];
            int b=B[i];
            set1.add(a);
            set2.add(b);
            if(a==b) count++;
            else{
                if(set2.contains(a)) count++;
                if(set1.contains(b)) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}