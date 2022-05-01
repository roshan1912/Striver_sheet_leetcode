class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk1.isEmpty() && s.charAt(i)=='#'){
                stk1.pop();
            }else if(stk1.isEmpty() && s.charAt(i)=='#'){
                continue;
            }
            else{
                stk1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(!stk2.isEmpty() && t.charAt(i)=='#'){
                stk2.pop();
            }else if(stk2.isEmpty() && t.charAt(i)=='#'){
                continue;
            }
            else{
                stk2.push(t.charAt(i));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator<Character> itr1 = stk1.iterator();
        while(itr1.hasNext()){
            sb1.append(itr1.next());
        }
        Iterator<Character> itr2 = stk2.iterator();
        while(itr2.hasNext()){
            sb2.append(itr2.next());
        }
        System.out.println(sb1);
        System.out.println(sb2);
        if(sb1.toString().equals(sb2.toString()))
            return true;
        return false;
    }
}