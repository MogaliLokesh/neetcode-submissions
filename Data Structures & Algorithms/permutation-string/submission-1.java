class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //calculate the number for s1;

        if(s1.length()>s2.length()) return false;

        int[] count = new int[26];

        for(char c: s1.toCharArray()){
            count[c-'a']++;
        }

        int n = s1.length();

        int l=0,r=n-1;


        // boolean res;

        while(r<s2.length()){
            int [] freq = new int[26];

            for(int i=l;i<=r;i++){
                freq[s2.charAt(i)-'a']++;
            }

            if(Arrays.equals(count,freq))return true;
            // freq[s2.charAt(r)-'a']--;
            // freq[s2.charAt(l)-'a']--;
            r++;l++;
        }

        return false;
    }
}
