class Solution {
    public int minMoves(int[] nums) {
       int max=Integer.MIN_VALUE;
       int ans=0;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
       }
       for(int num:nums){
        ans+=max-num;
       }
       return ans;
        
    }
}