class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int leftmax=nums[0];
        int maxFar=nums[0];
        int left=1;
        for(int i=1;i<nums.length;i++){
            maxFar=Math.max(maxFar,nums[i]);
            if(nums[i]<leftmax){
                leftmax=maxFar;
                left=i+1;
            }
        }
        return left;
    }
}