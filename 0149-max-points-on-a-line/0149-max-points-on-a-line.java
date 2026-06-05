class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2) return n;
        int max=0;
        for(int i=0;i<n;i++){
            HashMap<String,Integer> map = new HashMap<>();
            int x= points[i][0];
            int y= points[i][1];
            int localMax=0;
            for(int j=i+1;j<n;j++){
                int x1= points[j][0];
                int y1= points[j][1];

                int dx= x1-x;
                int dy= y1-y;

                int gcd= gcd(dx,dy);
                dx/=gcd;
                dy/=gcd;

                String slope = dx+ "/"+ dy;
                map.put(slope,map.getOrDefault(slope,0)+1);
                localMax= Math.max(localMax,map.get(slope)+1);
            }
            max= Math.max(max,localMax);
        }
        return max;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b = a%b;
            a =temp;
        }
        return a;
    }
}