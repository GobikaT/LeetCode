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
        List<Integer> c = new ArrayList<>();
        postorder(root,c);
        return c; 
    }
    public List<Integer> postorder(TreeNode root,List<Integer> c){
        Stack<TreeNode> x=new Stack<>();
        Stack<TreeNode> y=new Stack<>();
        if(root == null){
            return c ;
        }
        x.push(root);
        while(!x.isEmpty()){
            TreeNode temp=x.pop();
            y.push(temp);
            if(temp.left!=null){
                x.push(temp.left);
            }
            if(temp.right!=null){
                x.push(temp.right);
            }
        }
        while(!y.isEmpty()){
            c.add(y.pop().val);
        }
        return c;
    }
}