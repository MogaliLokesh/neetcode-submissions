class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->b-a);

        for(int i=0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size()>1){
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first==second){
                continue;
            }
            else{
                maxHeap.offer(Math.max(first,second)-Math.min(first,second));
            }
        }

        if(maxHeap.size()==0) return 0;
        return maxHeap.peek();
    }
}
