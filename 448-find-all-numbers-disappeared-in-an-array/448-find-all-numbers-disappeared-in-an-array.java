class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num:nums){
            nums[Math.abs(num%nums.length)]=-Math.abs(nums[Math.abs(num%nums.length)]);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            //System.out.println(nums[i]);
            if(i==0&&nums[i]>0) res.add(nums.length);
            else if(nums[i]>0) res.add(i);
        }
        
        return res;
    }
}