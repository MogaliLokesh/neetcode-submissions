class Solution {
    private static final String [] keyboard = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return res;
        }
        helper(digits, res, new StringBuilder(), 0);
        return res;
    }

    private void helper(String digits, List<String> res, StringBuilder cur, int index){
        int n = digits.length();

        if(index==n){
            res.add(cur.toString());
            return;
        }

        String str = keyboard[digits.charAt(index)-'0'];

        for(int i=0;i<str.length();i++){
            cur.append(str.charAt(i));
            helper(digits,res,cur,index+1);
            cur.deleteCharAt(cur.length()-1);
        }

    }
}
