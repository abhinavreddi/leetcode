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
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode currNode = root;
        while(currNode!=null || !stk.isEmpty()){
            while(currNode!=null){
                stk.push(currNode);
                currNode=currNode.left;
            }
            currNode = stk.pop();
            res.add(currNode.val);
            currNode=currNode.right;
        }
        return res;
    }
}