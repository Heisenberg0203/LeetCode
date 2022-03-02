class Solution {
    public int[] countBits(int n) {
       int[] ones = new int[n+1]; 
        int k=1;
        int i=1;
        while(i<=n){
            int curr=1;
            while(curr<=k&&i<=n){
                ones[i]=ones[i-k]+1;
                i++;curr++;
            }
            k=k*2;
        }
        
        return ones;
    }
}

// 0 0000
// 1 0001
// 2 0010
// 3 0011
// 4 0100
// 5 0101
// 6 0110
// 7 0111
// 8 1000
