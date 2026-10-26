class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    long sum=dfs(grid,m,n,i,j);
                    if(sum%k==0){
                        count++;
                    }
                }

            }
        }
        return count;
    }
    private long dfs(int grid[][],int m,int n,int i,int j){
        if(i<0 || j<0 || n<=j ||m<=i ||grid[i][j]==0){
            return 0;
        }
        long sum=grid[i][j];
        grid[i][j]=0;

        sum+=dfs(grid,m,n,i+1,j);
        sum+=dfs(grid,m,n,i-1,j);
        sum+=dfs(grid,m,n,i,j+1);
        sum+=dfs(grid,m,n,i,j-1);
        return sum;
    }
}