class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(0, 0, n, res, new StringBuilder());
        return res;
    }

    void helper(int open, int closed, int n, List<String> res, StringBuilder cur){
        if(open==closed && open==n) {
            res.add(cur.toString());
            return;
        }

        if(open<n){
            cur.append('(');
            helper(open+1, closed, n, res, cur);
            cur.deleteCharAt(cur.length()-1);
        }

        if(closed<open){
            cur.append(')');
            helper(open, closed+1, n, res, cur);
            cur.deleteCharAt(cur.length()-1);

        }


    }
}
