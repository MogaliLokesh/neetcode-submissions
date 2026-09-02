class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();

        for(char c: s.toCharArray()){
            freqs.put(c,freqs.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            freqt.put(c,freqt.getOrDefault(c,0)+1);
        }

        //compare both hashmaps...

        for(char c : freqs.keySet()){
            if(!freqs.get(c).equals(freqt.get(c))) return false;
        }

        return true;


    }
}
