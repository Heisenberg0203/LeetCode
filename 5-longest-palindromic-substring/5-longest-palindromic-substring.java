class Solution {
    Boolean[][] dp;
    String ans;
    public String longestPalindrome(String s) {
        ans = s.substring(0,1);
        dp = new Boolean[s.length()][s.length()];
         isPalindrome(s,0,s.length()-1);
        return ans;
    }
    
    public boolean isPalindrome(String s,int i,int j){
        if(i>j) return true;
        if(dp[i][j]!=null) return dp[i][j];
        
        if(i==j) return dp[i][j]=true;
        
        if(s.charAt(i)==s.charAt(j)){
            boolean subString = isPalindrome(s,i+1,j-1);
            if(subString){
                dp[i][j]=true;
                if(j-i+1>ans.length()) {
                    ans = s.substring(i,j+1);
                    //System.out.println(ans+" "+i+" "+j);
                }
                return dp[i][j];
            }
        }
        
        isPalindrome(s,i,j-1);
        isPalindrome(s,i+1,j);
        
        return dp[i][j]=false;
    }
}