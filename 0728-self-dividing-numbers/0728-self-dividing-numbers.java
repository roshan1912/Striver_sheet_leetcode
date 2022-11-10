class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num = i;
            int count=0;
            while(num>0){
                int n = num%10;
                if(n==0 || i%n!=0)
                    count++;
                num = num/10;
                    
            }
            if(count==0)
                ans.add(i);
        }
        return ans;
    }
}