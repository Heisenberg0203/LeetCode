class Solution {
    Boolean[][][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        dp = new Boolean[s1.length()+1][s2.length()+1][s3.length()+1];
        if(s1.length()+s2.length()!=s3.length()) return false;
       return solve(s1,s2,s3,0,0,0); 
    }
    
    public boolean solve(String s1,String s2,String s3,int i,int j,int k){
        if(dp[i][j][k]!=null) return dp[i][j][k];
        if(k==s3.length()) return dp[i][j][k]=true;
        if(i==s1.length()) return dp[i][j][k]=s2.substring(j).equals(s3.substring(k));
        if(j==s2.length()) return dp[i][j][k]=s1.substring(i).equals(s3.substring(k));
        
        boolean ans=false;
        
        if(s1.charAt(i)==s3.charAt(k))
            ans = ans| solve(s1,s2,s3,i+1,j,k+1);
        if(s2.charAt(j)==s3.charAt(k))
            ans = ans | solve(s1,s2,s3,i,j+1,k+1);
        
        return dp[i][j][k]=ans;
    }
}