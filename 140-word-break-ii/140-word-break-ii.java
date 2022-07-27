class Solution {
    HashMap<String,List<String>> map;
    public List<String> wordBreak(String s, List<String> wordDict) {
        map = new HashMap<>();
        return helper(s,wordDict);
    }
    
    
    public List<String> helper(String s,List<String> dict){
        List<String> list = new ArrayList<>();
        if(s.equals("")) {
            list.add("");
            return list;
        }
        if(map.containsKey(s)) return map.get(s);
        for(String word:dict){
            if(s.startsWith(word)){
                List<String> suffixList = helper(s.substring(word.length()),dict);
                for(String suffix:suffixList){
                    if(suffix.equals("")) list.add(word);
                    else list.add(word+" "+suffix);
                }
            }
        }
        map.put(s,list);
        return list;
    }
}