/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            if(curr==null) {
                sb.append("#");
                continue;
            }
            sb.append(curr.val+"#");
            queue.add(curr.left);
            queue.add(curr.right);
            
        }
        
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root=null;
        System.out.println(data);
        String[] vals = data.split("#");
        Queue<TreeNode> queue = new LinkedList<>();
        for(int i=0;i<vals.length;){
            TreeNode parent=null;
            if(root!=null) parent = queue.remove();
            if(vals[i]!=""){
                TreeNode left = new TreeNode(Integer.parseInt(vals[i]));
                if(root==null) {
                    root=left;
                    queue.add(root);
                    i++;
                    continue;
                }
                parent.left = left;
                queue.add(left);
            }
            
            if(i+1<vals.length&&vals[i+1]!=""){
                TreeNode right = new TreeNode(Integer.parseInt(vals[i+1]));
                parent.right=right;
                queue.add(right);
            }
            i+=2;
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));