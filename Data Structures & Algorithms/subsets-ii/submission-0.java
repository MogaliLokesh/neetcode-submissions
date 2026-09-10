class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }

    void helper(int i, int[] nums, List<Integer> cur, List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[i]);
        helper(i+1, nums, cur, res);

        cur.remove(cur.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        helper(i+1, nums, cur, res);
    }
}
