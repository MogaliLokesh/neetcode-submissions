class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int [] arrs = new int[26];
        int [] arrt = new int[26];

        for(int i=0;i<s.length();i++){
            arrs[s.toCharArray()[i]-'a']++;
            arrt[t.toCharArray()[i]-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arrs[i]!=arrt[i]) return false;
        }

        return true;

        // HashMap<Character, Integer> freqs = new HashMap<>();
        // HashMap<Character, Integer> freqt = new HashMap<>();

        // for(char c: s.toCharArray()){
        //     freqs.put(c,freqs.getOrDefault(c,0)+1);
        // }

        // for(char c: t.toCharArray()){
        //     freqt.put(c,freqt.getOrDefault(c,0)+1);
        // }

        // //compare both hashmaps...

        // for(char c : freqs.keySet()){
        //     if(!freqs.get(c).equals(freqt.get(c))) return false;
        // }

        // return true;


    }
}
