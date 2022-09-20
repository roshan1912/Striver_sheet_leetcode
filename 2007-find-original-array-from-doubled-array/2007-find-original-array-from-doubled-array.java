class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0){
            return new int[0];
        }
        Arrays.sort(changed);
        Map<Integer,Integer> m = new HashMap<>();
        int[] ans = new int[changed.length/2];
        int k=0;
        for(int i=0;i<changed.length;i++){
            m.put(changed[i],m.getOrDefault(changed[i],0)+1);
        }
        for(int i=0;i<changed.length;i++){
            if(m.containsKey(2*changed[i]) && m.get(2*changed[i])>0 && m.get(changed[i])>0){
                if(changed[i]==2*changed[i] && m.get(changed[i])<=1){
                   return new int[0];
                }
                ans[k++]=changed[i];
                m.put(changed[i],m.get(changed[i])-1);
                m.put(2*changed[i],m.get(2*changed[i])-1);
            }
        }
        if(2*k==changed.length){
            return ans;
        }
        return new int[0];
    }
}