class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b)            ->Integer.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1]));

        for(int i=0;i<points.length;i++){
            maxHeap.offer(points[i]);
            if(maxHeap.size()>k) maxHeap.poll();
        }

        int[][] res = new int[k][2];

        for(int i=0;i<k;i++){
            res[i]=maxHeap.poll();
        }

        return res;

    }
}
