class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] res = new int[temperatures.length];
        // stack.push(new int[]{temperatures[0],0});
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                res[stack.peek()[1]]=i-stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{temperatures[i],i});
        }
        

        return res;
    }
}
