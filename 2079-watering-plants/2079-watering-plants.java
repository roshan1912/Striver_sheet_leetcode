class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int cap = capacity;
        int tempcap = capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=tempcap){
                count++;
                tempcap = tempcap-plants[i];  
            }else{
                count += i;
                count += i+1;
                tempcap = cap;
                tempcap = tempcap - plants[i];
            }
        }
        return count;
    }
}