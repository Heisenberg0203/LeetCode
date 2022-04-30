class Solution {
    public int firstMissingPositive(int[] nums) {
        // sorting
        // hashset
        // use nums as set
        boolean isOne=false;
        int length = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) isOne=true;
            if(nums[i]<=0||nums[i]>nums.length) nums[i]=1;
        }
        if(!isOne) return 1;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<=nums.length){
                nums[Math.abs(nums[i])%length] = - Math.abs(nums[Math.abs(nums[i])%length]);
            }
        }
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0) return i;
        }
        
        return nums[0]>0?nums.length:nums.length+1;
        
    }
}