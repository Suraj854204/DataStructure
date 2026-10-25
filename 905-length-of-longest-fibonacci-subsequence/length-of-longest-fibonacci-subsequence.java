class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        //used dp
        int n=arr.length;
        int[][]dp=new int[n][n];
        int ans=0;
        for(int k=2;k<n;k++){
            int i=0, j=k-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum<arr[k]){
                    i++;
                }else if(sum>arr[k]){
                    j--;
                }else{
                    dp[j][k]=Math.max(3,dp[i][j]+1);
                    ans=Math.max(ans,dp[j][k]);
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}