class Solution {
    public int numPairsDivisibleBy60(int[] times) {
        int[] map = new int[60];
        int pairs=0;
        for(int time:times){
            int curr = time%60;
            if(curr==0) pairs+=map[0];
            else pairs+=map[60-curr];
            map[curr]++;
        }
        
        return pairs;
    }
}