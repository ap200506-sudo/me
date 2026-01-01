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
    void pre(TreeNode root , ArrayList al){
        if(root!=null){
            al.add(root.val);
            pre(root.left, al);
            pre(root.right, al);

        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        pre(root, al);
        return al;
        
    }
}