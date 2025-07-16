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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> c= new ArrayList<>();
        inorder(root,c);
        return c;
    }
        public List<Integer> inorder(TreeNode root,List<Integer> c){
        Stack<TreeNode> x= new Stack<>();
        TreeNode temp=root;
        while(temp!=null||!x.isEmpty()){
            while(temp!=null){
            x.push(temp);
            temp=temp.left;
        }
        temp=x.pop();
        
        c.add(temp.val);
        temp=temp.right;
        }
        return c;
        }

    }
