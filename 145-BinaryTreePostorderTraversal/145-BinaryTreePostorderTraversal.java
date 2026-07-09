// Last updated: 7/9/2026, 9:53:03 AM
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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root, list);
        return list;
    }
    void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }   
        postorder(root.left, list);         
        postorder(root.right, list); 
        list.add(root.val);   
    }
}