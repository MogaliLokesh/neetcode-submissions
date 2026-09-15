class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] res = new int[n+1];

        res[n-1]=s.charAt(n-1)=='0'?0:1;
        res[n]=1;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                continue;
            }
            res[i]+=res[i+1];
            if(Integer.valueOf(s.substring(i,i+2))<=26){
                res[i]+=res[i+2];
            }
        }

        return res[0];
    }
}
