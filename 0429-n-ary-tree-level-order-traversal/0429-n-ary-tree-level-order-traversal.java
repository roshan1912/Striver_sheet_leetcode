/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<len;i++){
                Node node = q.poll();
                temp.add(node.val);
                for(Node n:node.children){
                    q.add(n);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}