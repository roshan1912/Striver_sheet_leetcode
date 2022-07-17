class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack();
        ans[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()){
                ans[i]=st.peek();
                break;
            }
            if(arr[i]>st.peek()){
                st.push(arr[i]);
            }
        }
        return ans;
    }
}