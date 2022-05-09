class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && stk.peek()==s.charAt(i)){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            char c=stk.pop();
            ans.append(c);
        }
        ans.reverse();
        return ans.toString();
    }
}