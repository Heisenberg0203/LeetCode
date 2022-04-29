class Solution {
    public int missingNumber(int[] nums) {
       // sorting - nlogn
        // hashset - n,n
        //9 6 4+9 2 3+9 5 7+9 0 1
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^i^nums[i];
        }
        
        return xor^nums.length;
       
    }
}