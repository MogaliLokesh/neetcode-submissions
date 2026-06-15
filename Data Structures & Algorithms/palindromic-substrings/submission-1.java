class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int res=n;


        for(int i=0;i<n;i++){
            int left=i-1,right=i+1;
            while(left>=0&&right<n&& s.charAt(left)==s.charAt(right)){
                res++;
                left--;
                right++;
            }
        }
        

        for(int i=1;i<n;i++){
            int left=i-1,right=i;
            while(left>=0&&right<n&& s.charAt(left)==s.charAt(right)){
                res++;
                left--;
                right++;
            }
        }

        return res;
    }
}
