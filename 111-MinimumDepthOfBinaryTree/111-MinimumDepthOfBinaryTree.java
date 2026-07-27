// Last updated: 27/07/2026, 10:13:30
class Solution {

    public int minDepth(TreeNode root) {

        if(root == null) return 0;

        if(root.left == null && root.right == null)
            return 1;

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(root.left != null)
            left = 1 + minDepth(root.left);

        if(root.right != null)
            right = 1 + minDepth(root.right);

        return Math.min(left, right);
    }
}