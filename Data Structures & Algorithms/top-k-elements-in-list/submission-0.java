class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int [] res = new int[k];

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[1]-b[1]);


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.add(new int []{entry.getKey(),entry.getValue()});

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        for(int i=0;i<k;i++){
            res[i]= minHeap.poll()[0];
        }
        
        return res;
    }
}
