class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        int[] ans= new int[A.length];
        int[] freq= new int[A.length+1];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(++freq[A[i]]==2)count++;
            if(++freq[B[i]]==2)count++;
            ans[i]=count;
        }
        return ans;
    }
}