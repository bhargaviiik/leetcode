class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        //area=height*width; w=r-l
        
        int[] left = new int[heights.length];
        int[] right= new int[heights.length];

        Stack<Integer> stack = new Stack<>();
        
        //left min
        for(int i=0;i<heights.length;i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        //right min
        for(int i=heights.length-1;i>=0;i--){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(right[i]-left[i]-1);
            max=(area>max)?area:max;
        }
        return max;

    }
}