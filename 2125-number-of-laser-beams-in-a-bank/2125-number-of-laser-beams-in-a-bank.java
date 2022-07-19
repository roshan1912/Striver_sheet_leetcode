class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            String s = bank[i];
            char[] ch = s.toCharArray();
            int count=0;
            for(char c:ch){
                if(c=='1')
                    count++;
            }
            if(count!=0)
                list.add(count);
        }
        int sum=0;
        for(int i=0;i<list.size()-1;i++){
            int val = list.get(i)*list.get(i+1);
            sum += val;
        }
        return sum;
    }
}