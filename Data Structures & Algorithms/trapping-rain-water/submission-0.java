class Solution {
    public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int[] min = new int[height.length];

        // lmax[0]=0;
        for(int i=1;i<height.length;i++){
           lmax[i]=Math.max(lmax[i-1],height[i-1]); 
        }

        for(int j=height.length-2;j>=0;j--){
            rmax[j]=Math.max(rmax[j+1],height[j+1]);
        }

        int res=0;

        for(int i=0;i<height.length;i++){
            if(Math.min(lmax[i],rmax[i])-height[i] >0) res+=Math.min(lmax[i],rmax[i])-height[i];
        }
        
        return res;
    }
}
