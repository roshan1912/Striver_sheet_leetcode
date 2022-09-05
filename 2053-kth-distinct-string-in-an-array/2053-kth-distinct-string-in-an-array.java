class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> m1=new HashMap<>();
        Map<Integer,String> m2=new HashMap<>();
        for(String i:arr){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(String i:arr){
            if(m1.get(i)==1 && ++ans==k){
                return i;
            }
        }
        return "";
    }
}