class Solution {
    public int leastInterval(char[] tasks, int n) {
    
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    int [] freq = new int [26];

    for(char task: tasks){
        freq[task-'A']++;
    }

    for(int i=0;i<26;i++){
        if(freq[i]>0) maxHeap.add(freq[i]);
    }
    
    Queue<int []> que = new LinkedList<>();
    
    int time =0;
    
    while(!maxHeap.isEmpty() || !que.isEmpty()){
        
            if(!que.isEmpty() && que.peek()[1]==time){
                maxHeap.add(que.poll()[0]);
            }
            if(!maxHeap.isEmpty()){
            int temp = maxHeap.poll();
            temp--;
            if(temp>0){
                que.add(new int []{temp, time+n+1});
            }
            }
        
        time++;
    }

    return time;   
    }
}
