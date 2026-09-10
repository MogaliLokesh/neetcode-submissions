class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, candidates, res, new ArrayList<>());
        return res;
    }

    void helper(int i, int target, int[] candidates, List<List<Integer>> res, List<Integer> cur){
        if(target==0){
            res.add(new ArrayList(cur));
            return;
        }

        if(i==candidates.length || candidates[i] > target) return;

        target=target-candidates[i];
        cur.add(candidates[i]);
        helper(i+1, target, candidates, res, cur);

        target=target+candidates[i];
        cur.remove(cur.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1]){
            i++;
        }
        helper(i+1, target, candidates, res, cur);
    }
}
