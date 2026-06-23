class TimeMap {
    // 1. Declare the Map using String for the key, and a List of Pairs for the values
    Map<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        // 2. Initialize the list if the key doesn't exist yet
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        
        // 3. Add the new timestamp/value pair to the list
        map.get(key).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        // 4. Return an empty string if the key hasn't been set
        if (!map.containsKey(key)) {
            return "";
        }
        
        List<Pair<Integer, String>> list = map.get(key);
        int start = 0;
        int end = list.size() - 1;
        String res = "";
        
        // 5. Binary search to find the closest valid timestamp
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (list.get(mid).getKey() <= timestamp) {
                // This timestamp is valid, record the value
                res = list.get(mid).getValue();
                // Search to the right to see if there is an even closer, larger timestamp
                start = mid + 1;
            } else {
                // This timestamp is too large, search to the left
                end = mid - 1;
            }
        }
        
        return res;
    }
}