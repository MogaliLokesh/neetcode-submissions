class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length+1];
        // int res=Math.min(cost[0], cost[1]);

        // for(int i=2;i<cost.length;i++){
            // res=Math.min(
        // }

        res[0]=0;
        res[1]=0;
        for(int i=2;i<=cost.length;i++){
            res[i]=Math.min(res[i-1]+cost[i-1],res[i-2]+cost[i-2]);
        }

        return res[res.length-1];
    }
}
