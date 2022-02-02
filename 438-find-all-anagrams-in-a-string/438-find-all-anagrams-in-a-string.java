class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> idx = new ArrayList<>();
        if(s.length()<p.length()) return idx;
        int[] pcount = new int[26];
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
        }
        
        int requiredCount = p.length();
        int[] scount = new int[26];
        
        for(int i=0;i<s.length();i++){
            char currch=s.charAt(i);
            scount[currch-'a']++;
            if(scount[currch-'a']<=pcount[currch-'a']) requiredCount--;
            
            if(requiredCount==0) idx.add(i-p.length()+1);
            
            if(i>=p.length()-1){
                
                char prev = s.charAt(i-p.length()+1);
                if(scount[prev-'a']<=pcount[prev-'a']) requiredCount++;
                scount[prev-'a']--;
            }
        }
        
        return idx;
    }
}

