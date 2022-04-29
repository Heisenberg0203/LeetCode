class Solution {
    public boolean containsDuplicate(int[] nums) {
     // sorting - nlogn,1
     // hashset - n,n
        
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        
        return false;
    }
}