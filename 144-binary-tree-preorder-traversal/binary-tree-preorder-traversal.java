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
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        if(root==null)return lst;
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode curr = stk.pop();
            lst.add(curr.val);
            if(curr.right!=null)stk.push(curr.right);
            if(curr.left!=null)stk.push(curr.left);
        }

        return lst;
    }
}