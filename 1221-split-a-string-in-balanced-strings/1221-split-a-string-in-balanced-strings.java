class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int Rcount=0;
        int Lcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                Rcount++;
            if(s.charAt(i)=='L')
                Lcount++;
            if(Rcount==Lcount){
                count++;
                Rcount=0;
                Lcount=0;
            }
        }
        return count;
    }
}