class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++){
           while(left<i&&set.contains(s.charAt(i))){
               set.remove(s.charAt(left));
               left++;
           }
            
           max=Math.max(max,i-left+1);
           set.add(s.charAt(i));
        }
        
        return max;
    }
}