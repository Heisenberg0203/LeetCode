class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums) xor^=num;
        
        int bit=0;
        
        for(int i=0;i<32;i++){
            if((xor&(1<<i))>0) {
                bit=i;break;
            }
        }
        
        int oneNumber=0;
        
        for(int num:nums){
            if((num&(1<<bit))>0){
                oneNumber^=num;
            }
        }
        
        //oneNumber = oneNumber^xor;
        int twoNumber = xor^oneNumber;
        
        return new int[]{oneNumber,twoNumber};
    }
}

