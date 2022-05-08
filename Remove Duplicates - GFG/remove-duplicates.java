// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        Set<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(set.contains(ch)){
                continue; 
            }else{
                set.add(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}