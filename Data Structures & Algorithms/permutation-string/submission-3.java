class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
    return false;
}
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int matched=0,l=0;
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }



        for(int i=0;i<26;i++){
            if(freq1[i]==freq2[i]) matched++;
        }

        for(int r=s1.length();r<s2.length();r++){
            if(matched==26) return true;
            
            int i = s2.charAt(l)-'a';
            if(freq2[i] == freq1[i]){
                matched--;
            }
            else if(freq2[i]-1 == freq1[i]){
                matched++;
            }
            l++;
            freq2[i]--;

            int j = s2.charAt(r)-'a';

            if(freq2[j] == freq1[j]){
                matched--;
            }
            else if(freq2[j]+1 == freq1[j]){
                matched++;
            }
            freq2[j]++;
            // r++;
        }

        return matched==26;

    }
}
