class Solution {
    public int calPoints(String[] ops) {
        int ans = Integer.parseInt(ops[0]);
        Stack<Integer> stack = new Stack<>();
        stack.push(ans);
        for(int i = 1; i < ops.length; i++){
            int val = 0;
            if(ops[i].equals("C")){
                ans -= stack.pop();
            }else if(ops[i].equals("D")){
                val = 2*stack.peek();
                stack.push(val);
            }else if(ops[i].equals("+")){
                int two = stack.pop();
                val = stack.peek() + two;
                stack.push(two);
                stack.push(val);
            }else{
                val = Integer.parseInt(ops[i]);
                stack.push(val);
            }
            ans += val;
        }
        return ans;
    }
}