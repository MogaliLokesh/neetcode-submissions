class Solution {
    public int findDuplicate(int[] nums) {

        int slow=0,fast=0;

        while(fast<nums.length){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast) break;
        }

        int left=0;
        while(left!=slow){
            slow=nums[slow];
            left=nums[left];
        }


        return left;
        
    }
}
