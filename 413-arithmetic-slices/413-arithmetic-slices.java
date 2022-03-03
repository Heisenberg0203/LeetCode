class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int last=0;
        int d = nums[1]-nums[0];
        int count=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==d){
                if(i-last>=2){
                    count=count+(i-last-1);
                }
            }
            else{
                last=i-1;
                d=nums[i]-nums[i-1];
            }
        }
        return count;
    }
}