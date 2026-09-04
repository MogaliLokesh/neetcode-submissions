class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxf=0,maxLen=0;

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            //add the character;
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
            maxf=Math.max(maxf,freq.get(s.charAt(i)));

            while(i-l+1-maxf>k){
                //remove at l
                freq.put(s.charAt(l),freq.get(s.charAt(l))-1);
                l++;
                // maxf=Math.max(i-l+1-freq.get(s.charAt(i)),freq.get(s.charAt(i)));
            }
            maxLen=Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
}
