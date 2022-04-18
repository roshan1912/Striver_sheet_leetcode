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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if(root1!=null){
            list.addAll(process(root1));
        }
        if(root2!=null){
            list.addAll(process(root2));
        }
        Collections.sort(list);
        return list;
        
    }
    public List<Integer> process(TreeNode root){
        List<Integer> list2 = new ArrayList<>();
        list2.add(root.val);
        if(root.left!=null){
            list2.addAll(process(root.left));
        }
        if(root.right!=null){
            list2.addAll(process(root.right));
        }
        return list2;
    }
}