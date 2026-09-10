class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, res, new ArrayList<>());
        return res;
    }

    void helper(int i, int[] nums, List<List<Integer>> res, List<Integer> cur){
        if(i>=nums.length){
            res.add(new ArrayList(cur));
            return;
        }

        cur.add(nums[i]);
        helper(i+1, nums, res, cur);
        cur.remove(cur.size()-1);

        helper(i+1, nums, res, cur);
    }
}
