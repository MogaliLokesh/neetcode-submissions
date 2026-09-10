class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            List<List<Integer>>curTemp = new ArrayList<>();
            for(int j=0;j<res.size();j++){
                for(int k=0;k<=res.get(j).size();k++){
                    List<Integer> copy = new ArrayList<>(res.get(j));
                    copy.add(k,nums[i]);
                    curTemp.add(copy);
                }
            }
            res = curTemp;
        }

        return res;
    }
}
