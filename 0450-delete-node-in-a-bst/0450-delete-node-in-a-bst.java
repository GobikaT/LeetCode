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
    public TreeNode deleteNode(TreeNode root, int key) {
        root=delval(root,key);
        return root;
    }
    public TreeNode delval(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left=delval(root.left,key);
        }
        else if(key>root.val){
            root.right=delval(root.right,key);
        }
        else{
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            root.val=minval(root.right);
            root.right=delval(root.right,root.val);
        }
        return root;
    }
    public int minval(TreeNode root){
        int min=root.val;
        while(root.left!=null){
            root=root.left;
            min=root.val;
        }
        return min;

    }
}