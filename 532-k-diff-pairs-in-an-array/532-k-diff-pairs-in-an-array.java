class Solution {
    public int findPairs(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int num:nums){
            if(k==0) {
                if(map.containsKey(num)&&map.get(num)==1) count++;
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                if(map.containsKey(num)) continue;
                if(map.containsKey(num-k)) count++;
                if(map.containsKey(num+k)) count++;
                map.put(num,1);
            }
        }
        
        return count;
    }
}





