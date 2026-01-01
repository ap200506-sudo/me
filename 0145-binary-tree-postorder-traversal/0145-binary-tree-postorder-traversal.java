/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        Stack <TreeNode> s1 = new Stack <TreeNode>();
        Stack <TreeNode> s2 = new Stack <TreeNode>();
        if(root == null){
            return al;
        }
        s1.push(root);
        while(true){
            root=s1.pop();
            
            s2.push(root);
            if(root.left!=null){
                s1.push(root.left);
            }
            if(root.right != null){
                s1.push(root.right);
            }
            if(s1.isEmpty()){
                break;
            }
            

        }
        while(!s2.isEmpty()){
            root=s2.pop();
            al.add(root.val);
        }
        return al;
        
    }
}