class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>set = new HashSet<>();
       for(int n: nums){
        set.add(n);
       }

       int longest=0;

       for(int num: set){
        if(!set.contains(num+1)){
        int temp=num;
        int len=1;

        while(set.contains(temp-1)){
            len++;
            temp--;
        }

        longest=Math.max(len,longest);
        }
       }

       return longest;
        
    }
}
