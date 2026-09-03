class Solution {
    public int search(int[] nums, int target) {
        // int i=0,j=nums.length-1;

        // while(i<=j){
        //     int mid = (i+j)/2;
        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     else if (nums[mid]>target){
        //         j=mid-1;
        //     }
        //     else{
        //         i=mid+1;
        //     }

        // }
        // return -1;

        int l=0,r=nums.length;

        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }

        return l<nums.length && nums[l]==target ? l : -1;
    }
}
