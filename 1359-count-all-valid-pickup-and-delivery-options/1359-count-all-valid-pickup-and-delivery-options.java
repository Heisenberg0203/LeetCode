class Solution {
    long[][] dp;
    int mod=1000000000+7;
    public int countOrders(int n) {
        dp = new long[n+1][n+1];
     return (int)(solve(n,0,0));   
    }
    
    public long solve(int n, int p,int d){
        
        if(dp[p][d]!=0) return dp[p][d];
        if(p==n){
            if(d==n) return dp[p][d]=1;
            return dp[p][d]=((p-d)*solve(n,p,d+1)%mod)%mod;
        }
        
        if(p==d){
            return dp[p][d]=((n-p)*solve(n,p+1,d)%mod)%mod;
        }
        
        return dp[p][d]=(((n-p)*solve(n,p+1,d)%mod)%mod+
                         ((p-d)*solve(n,p,d+1)%mod)%mod);
    }
}