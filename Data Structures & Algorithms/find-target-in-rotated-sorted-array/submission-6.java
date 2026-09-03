class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;

        while(l<r){
            int mid = l+(r-l)/2;

            if(nums[mid]>=nums[0]){
                if(target>=nums[0] && target<=nums[mid]){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target<=nums[mid] || target > nums[r]){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return  nums[l]==target ? l : -1;
    }
}
