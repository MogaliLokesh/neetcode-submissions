class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] freq = new int [26];

            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }

            String key = Arrays.toString(freq);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
