class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=Integer.MAX_VALUE;
        
        int base=0;
        if(k==blocks.length()){
            for(int i=0;i<blocks.length();i++){
                if(blocks.charAt(i)=='W')
                    base++;
            }
            return base;
        }
        for(int i=0;i<=blocks.length()-k;i++){
            int tc=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W')
                    tc++;
            }
            if(tc<count){
                count=tc;
            }
        }
         return count;   
    }
}