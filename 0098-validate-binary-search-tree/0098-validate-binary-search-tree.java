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
    public boolean isValidBST(TreeNode root) {
        TreeNode temp=root;
        TreeNode min=null;
        Stack<TreeNode> x=new Stack<>();
        while(temp!=null||!x.isEmpty()){
            while(temp!=null){
                x.push(temp);
                temp=temp.left;
            }
            temp=x.pop();
            if(min!=null&&temp.val <= min.val){
                return false;
            }
            min=temp;
            temp=temp.right;
        }
        return true;
        
    }
}