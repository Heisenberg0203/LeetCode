class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int max=nums[0];
        int jumps=1;
        int idx=1;
        while(max<nums.length-1){
            int currmax=max;
            for(int i=idx;i<=max;i++){
                if(i+nums[i]>currmax) {
                    currmax=i+nums[i];
                    idx=i;
                }
            }
            
            max=currmax;
            
            jumps++;
        }
        
        return jumps;
    }
}