class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int prev=1;
        int curr=1;
        
        for(int i=3;i<=n;i++){
           int ans=curr+prev;
           prev=curr;
           curr=ans;
        }
        
        return curr;
    }
}