class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] track = new int[s.length()+1];
        return helper(0,s,wordDict,track);
    }

    boolean helper(int i, String s, List<String> wordDict,int[] track){
        if(i>=s.length()) return true;


        for(String word:wordDict){
            if(i+word.length()<=s.length() && s.substring(i,i+word.length()).equals(word)){
                // if(helper(i+word.length(),s,wordDict)) return true;
                if(track[i+word.length()]==1) return true;
                else if (track[i+word.length()]==0) {
                    if(helper(i+word.length(),s,wordDict,track)){
                        track[i+word.length()]=1;
                        return true;
                    }
                    else{
                        track[i+word.length()]=2;
                    }
                }
            }
        }

        return false;
    }
}
