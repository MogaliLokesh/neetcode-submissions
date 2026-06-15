public class Solution {
    public String longestPalindrome(String s){
        int n = s.length();
        int index=0,maxLen=1;
        for(int i=0;i<n;i++){
            int len=1;
            int left=i-1,right=i+1;
            while(left>=0&&right<n && s.charAt(left)==s.charAt(right)){
                    // index=left;
                    len=len+2;
                    if(len>maxLen){
                        index=left;
                        maxLen=len;
                    }
                    left=left-1;
                    right=right+1;
            }
        }
        // int len=0;
        for(int i=1;i<n;i++){
            int len=0;
            int left=i-1,right=i;
            while(left>=0&&right<n && s.charAt(left)==s.charAt(right)){
                    // index=left;
                    len=len+2;
                    if(len>maxLen){
                        index=left;
                        maxLen=len;
                    }
                    left=left-1;
                    right=right+1;
            }
        }
       

        return s.substring(index,index+maxLen);
    }

};
