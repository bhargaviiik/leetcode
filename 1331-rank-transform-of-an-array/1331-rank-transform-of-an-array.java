class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;
        int[] newArr= new int[n];
        for(int i=0;i<n;i++) newArr[i]=arr[i];
        Arrays.sort(newArr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(newArr[i])){
                map.put(newArr[i],rank);
                rank++;
            }
        }
  
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}