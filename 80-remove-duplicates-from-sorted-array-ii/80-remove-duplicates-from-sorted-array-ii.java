class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int prev2=nums[0],prev1=nums[1];
        int idx=2;
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=prev2) {
                nums[idx++]=nums[i];
                
            }
            prev2=prev1;
            prev1=nums[i];
            
        }
        return idx;
    }
}