class Solution {
    public int singleNumber(int[] nums) {
        int dup=0;
        
        for(int i=0;i<32;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=(nums[j]&1);
                nums[j] = nums[j]>>1;
            }
            
            if(sum%3!=0) dup = dup | (1<<i);
        }
        
        return dup;
    }
    
}