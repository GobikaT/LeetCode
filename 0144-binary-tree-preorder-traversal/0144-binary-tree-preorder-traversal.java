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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> c=new ArrayList<>();
        proorder(root,c);
        return c;
    }
    public List<Integer> proorder(TreeNode root,List<Integer> c){
        Stack<TreeNode> x= new Stack<>();
        if(root==null){
            return null;
        }
        x.push(root);
        while(!x.isEmpty()){
            TreeNode temp=x.pop();
            c.add(temp.val);
            if(temp.right!=null){
                x.push(temp.right);
            }
            if(temp.left!=null){
                x.push(temp.left);
            }
        }
        return c;
    }
}