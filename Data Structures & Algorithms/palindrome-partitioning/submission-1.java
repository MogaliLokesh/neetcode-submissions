class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), s, 0);
        return res;
    }

    private void helper(List<List<String>> res, List<String> cur, String s, int start){
        int n=s.length();
        if(start==n){
            res.add(new ArrayList<>(cur));
            return;
        }


        for(int i=start;i<n;i++){
            if(isPalindrome(s,start,i)){
                cur.add(s.substring(start,i+1));

                helper(res, cur, s, i+1);

                cur.remove(cur.size()-1);
            }
        }



    }

    private boolean isPalindrome(String s, int start, int end){
        // if(start)
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
