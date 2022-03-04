class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double[][] dp = new double[102][102];
        dp[0][0]=(double)poured;
        for(int i=0;i<=query_row;i++){
            for(int  j=0;j<=i;j++){
                double extra = (dp[i][j]-1.0);
                if(extra>0){
                    dp[i+1][j]+=extra/2.0;
                    dp[i+1][j+1]=extra/2.0;
                }
            }
            
            
        }
        
        return Math.min(1.0,dp[query_row][query_glass]);
    }
}



