class Solution {
    public int findDuplicate(int[] nums) {
//         int length = nums.length;
//         for(int i=0;i<nums.length;i++){
//             if(nums[Math.abs(nums[i])]>0)
//                 nums[Math.abs(nums[i])] = - (nums[Math.abs(nums[i])]);
//             else return Math.abs(nums[i]);
            
//         }
        
        
//         return -1;
        
        int slow = nums[0],fast=nums[0];
        
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        slow = nums[0];
        
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        
        return slow;
    }
}