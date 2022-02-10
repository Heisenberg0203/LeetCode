class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum=0;
        map.put(currsum,1);
        for(int num:nums){
            currsum+=num;
            if(map.containsKey(currsum-k)){
                count+=map.get(currsum-k);
            }
            
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        
        return count;
    }
}