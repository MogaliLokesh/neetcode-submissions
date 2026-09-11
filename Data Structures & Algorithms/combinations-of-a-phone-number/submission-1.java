class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        String[] keypad = new String []{ "","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        res.add("");

        for(char c : digits.toCharArray()){
            List<String> tempRes = new ArrayList<>();
            for(String cur : res){
                for(char k : keypad[c-'0'].toCharArray()){
                    tempRes.add(cur+k);
                }
            }

            res=tempRes;
        }

        return res;

    }
}
