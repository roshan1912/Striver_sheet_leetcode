class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for(int i=0;i<paths.size();i++){
            List<String> temp = paths.get(i);
            list.add(temp.get(0));
            list2.add(temp.get(1));
        }
        for(int i=0;i<list2.size();i++){
            if(!list.contains(list2.get(i))){
                return list2.get(i);
            }
        }
        return "hey";
    }
}