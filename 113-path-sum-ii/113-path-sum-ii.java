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
    public void findpath(TreeNode root,List<Integer> arr,List<List<Integer>> list,int target){
        if(root == null) return;
        if(root.left==null && root.right==null){
            if(target-root.val==0){
                List<Integer> temp = new ArrayList<>(arr);//new copy to avoid conflict in actual arr.
                temp.add(root.val);
                list.add(temp);
            }
            return;
        }
        arr.add(root.val);
        findpath(root.left,arr,list,target-root.val);
        findpath(root.right,arr,list,target-root.val);
        arr.remove(arr.size()-1);//backtracking for and removing last value if didn't match.
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        List<Integer> check = new ArrayList<>();
        findpath(root,check,list,targetSum);
        // System.out.println(check);
        return list;
    }
}