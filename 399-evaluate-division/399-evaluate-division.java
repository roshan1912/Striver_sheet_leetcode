class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = values.length;
        Map<String,ArrayList<Pair>> m = new HashMap<>();
        
        for(int i=0;i<n;i++){
            List<String> l = equations.get(i);
            ArrayList<Pair> al1 = m.getOrDefault(l.get(0),new ArrayList<>());
            ArrayList<Pair> al2 = m.getOrDefault(l.get(1),new ArrayList<>());
            al1.add(new Pair(l.get(1),values[i]));
            al2.add(new Pair(l.get(0),(double)1/values[i]));
            m.put(l.get(0),al1);
            m.put(l.get(1),al2);
        }
        
        int me = queries.size();
        double[] ans = new double[me];
        int i =0;
        
        for(List<String> l:queries){
            Set<String> s = new HashSet<>();
            if(m.containsKey(l.get(0)) && m.containsKey(l.get(1)))
                ans[i] = f(l.get(0),l.get(1),m,s);
            else
                ans[i] = (double)-1;
            i++;
        }
        
        return ans;
    }
    
    public double f(String s,String d,Map<String,ArrayList<Pair>> m,Set<String> st){
        if(st.contains(s))
            return (double)-1;
        
        if(s.equals(d))
            return (double)1;
        
        st.add(s);
        
        ArrayList<Pair> l = m.get(s);
        
        for(Pair p:l){
            if(!st.contains(p.c)){
                double b = f(p.c,d,m,st);
                
                if(b != (double)-1)
                    return b*p.x;
            }
        }
        
        return (double)-1;
    }
    
    
    class Pair{
        String c;
        double x;
        
        Pair(String c,double x){
            this.c = c;
            this.x = x;
        }
    }
}