class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        //index,height
        int maxHeight=0;
        
        for(int i=0;i<heights.length;i++){
            int start=i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]){
                int [] temp = stack.peek();
                stack.pop();
                maxHeight=Math.max(maxHeight,temp[1]*(i-temp[0]));
                start=temp[0];
            }
            stack.push(new int []{start,heights[i]});
        }

        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            // stack.pop();
            int i=heights.length;
            maxHeight=Math.max(maxHeight,temp[1]*(i-temp[0]));
        }

        return maxHeight;
    }
}
