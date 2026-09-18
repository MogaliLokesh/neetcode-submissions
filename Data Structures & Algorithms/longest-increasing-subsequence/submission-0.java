class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] mem = new int[nums.length];
        for(int i=0;i<mem.length;i++){
            mem[i]=-1;
        }
        for(int i=0;i<mem.length;i++){
            helper(i,nums,mem);
        }
        int res=0;
        for(int i=0;i<mem.length;i++){
            res=Math.max(res,mem[i]);
        }

        return res;
    }

    private int helper(int i, int[] nums, int[] mem){
        if(i>=nums.length) return 0;
        if(mem[i]!=-1) return mem[i];
        // if(mem[i]==1) return true;
        // if(mem[i]==2) return false;
        mem[i]=1;
        for(int start=i+1;start<nums.length;start++){
            if(nums[start]>nums[i]) mem[i]=Math.max(mem[i],1+helper(start,nums,mem));
        }

        return mem[i];
    }
}
