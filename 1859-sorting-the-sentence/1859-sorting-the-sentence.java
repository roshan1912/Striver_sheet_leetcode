class Solution {
    public String sortSentence(String s) {
        String[]str=s.split(" ");
        String []res=new String[str.length];
        StringBuilder sb=new StringBuilder();
        int i=0;
        for (String x:str) {
            i=(int) (x.charAt(x.length()-1)-'0');
            res[i-1]=x.substring(0,x.length()-1);
        }
        for ( i = 0; i <res.length-1 ; i++)
            sb.append(res[i]).append(" ");
            sb.append(res[i]);
     return sb.toString();
    }
}