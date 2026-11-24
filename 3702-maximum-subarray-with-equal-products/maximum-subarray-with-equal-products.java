class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int currProd=nums[i];
            int currGcd=nums[i];
            int currLcm=nums[i];
            for(int j=i+1;j<n;j++){
                currProd*=nums[j];
                currGcd=gcd(currGcd,nums[j]);
                currLcm=lcm(currLcm,nums[j]);
                if(currProd==currGcd*currLcm){
                    max=Math.max(max,j-i+1);
                }

            }
        }
        return max;
    }
}