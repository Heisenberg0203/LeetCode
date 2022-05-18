class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m =grid.length,n=grid[0].length;
       dp = new Integer[m][n];
        return solve(grid,m,n,0,0); 
    }
    Integer[][] dp;
    
    public int solve(int[][] grid,int m,int n,int i,int j){
        if(i==m||j==n) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if (grid[i][j]==1) return dp[i][j]=0;
        if(i==m-1&&j==n-1) return 1;
        return dp[i][j]=solve(grid,m,n,i+1,j)+solve(grid,m,n,i,j+1);
    }
}