class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
        int currsum=0;
        int length=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            currsum+=(nums[i]==1?1:-1);
            if(map.containsKey(currsum)){
                length=Math.max(length,i-map.get(currsum));
            }
            else map.put(currsum,i);
        }
        return length;
    }
}