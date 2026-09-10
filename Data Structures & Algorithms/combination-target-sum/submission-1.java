class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, target, res, new ArrayList<>());
        return res;
    }

    void helper(int i, int[] nums, int target, List<List<Integer>> res, List<Integer> cur){
        if(target==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i>=nums.length){
            return;
        }
        // if(target)
        if(nums[i]>target){
            return;
        }

        target=target-nums[i];
        cur.add(nums[i]);
        helper(i, nums, target, res, cur);
        cur.remove(cur.size()-1);
        target=target+nums[i];
        helper(i+1, nums, target, res, cur);
    }
}
