class Solution {
    public int missingNumber(int[] nums) {
       // sorting - nlogn
        // hashset - n,n
        //9 6 4+9 2 3+9 5 7+9 0 1
        
        boolean isZero = false;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums.length;
                isZero=true;
                break;
            }
        }
        
        if(!isZero) return 0;
        int length=nums.length;
        for(int num:nums){
            nums[Math.abs(num)%length] = -(Math.abs(nums[Math.abs(num)%length]));
        }
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0)  return i;
        }
        
        return nums.length;
       
    }
}