class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        String[] dirs = path.split("/");
        
        for(String dir:dirs){
            if(dir.equals("")||dir.equals(".")) continue;
            if(dir.equals("..")&&!stack.isEmpty()) stack.pop();
            if(!dir.equals(".."))  stack.push(dir);
        }
        if(stack.isEmpty()) return "/";
        
        ArrayList<String> dirsInPath = new ArrayList<>();
        while(!stack.isEmpty()) dirsInPath.add(0,stack.pop());
        StringBuffer validPath = new StringBuffer();
        for(String dir:dirsInPath){
            validPath.append("/"+dir);
        }
        return validPath.toString();
    }
}