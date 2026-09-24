class Solution {
    public long getHours(int[] piles, int k) {
    long res = 0;
    for (int p : piles) {
        res += (p - 1) / k + 1;
    }
    return res;
}

    public int minEatingSpeed(int[] piles, int h) {
        int res=0;
        for(int i: piles){
            res = Math.max(res, i);
        }

        int l=1;
        while(res>l){
            int mid = l+(res-l)/2;
            long hours = getHours(piles,mid);
            if (hours<=h){
                res=mid;
            }
            if(hours>h){
                l=mid+1;
            }
        }

        return res;


    }

    












    // public int minEatingSpeed(int[] piles, int h) {
    //     int l=1;
    //     int r = Arrays.stream(piles).max().getAsInt();


    //     while(l<r){
    //         int mid = l+(r-l)/2;
    //         int hours = getHours(piles,mid);
    //         if(hours<=h){
    //             r=mid;
    //         }
    //         else{
    //             l=mid+1;
    //         }
    //     }

    //     return l;
        
    // }
}
