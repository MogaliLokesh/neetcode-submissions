class Solution {
    public int getHours(int [] piles, int k){
        int res=0;
        for(int p:piles){
            // res+=Math.ceil(p/k);
            res+=(p-1)/k+1;
        }

        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r = Arrays.stream(piles).max().getAsInt();


        while(l<r){
            int mid = l+(r-l)/2;
            int hours = getHours(piles,mid);
            if(hours<=h){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }

        // if(gethours(piles,l)<=9) return l;
        return l;
        
    }
}
