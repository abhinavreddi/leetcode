class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) {
            solve(root, "", res);
        }
        return res;
    }

    void solve(TreeNode root, String path, List<String> res) {
        if (root == null) return;

        if (path.length() > 0) {
            path += "->" + root.val;
        } else {
            path += root.val;
        }

        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        if (root.left != null) {
            solve(root.left, path, res);
        }
        if (root.right != null) {
            solve(root.right, path, res);
        }
    }
}
