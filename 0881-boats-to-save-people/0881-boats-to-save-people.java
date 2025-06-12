class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        Arrays.sort(people);
        int c=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(i==j){
                c++;
                break;
            }
            int sum=people[i]+people[j];
            if(sum<=limit){
                c++;
                i++;
                j--;
                continue;
            }
            if(sum>limit){
                c++;
                j--;
                
            }
           
        }
        
        return c;
    }
    
}