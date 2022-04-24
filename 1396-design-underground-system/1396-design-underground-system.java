class UndergroundSystem {
    Map<Integer,String> idToStation;
Map<Integer,Integer> idToTime;
Map<String,Integer> stationTime;
Map<String,Integer> stationTimeCount;
public UndergroundSystem() {
idToStation = new HashMap<>();
idToTime = new HashMap<>();
stationTime = new HashMap<>();
stationTimeCount = new HashMap<>();
}

   public void checkIn(int id, String stationName, int t) {
    idToStation.put(id,stationName);
    idToTime.put(id,t);
}

public void checkOut(int id, String stationName, int t) {
    if(idToStation.containsKey(id)){
        StringBuilder sb = new StringBuilder();
        sb.append(idToStation.get(id));
        sb.append("-");
        sb.append(stationName);
        int startTime = idToTime.get(id);
        String s = sb.toString();
        if(stationTime.containsKey(s)){
            stationTime.put(s,stationTime.get(s)+t-startTime);
        }
        else{
            stationTime.put(s,t-startTime);
        }
        
        stationTimeCount.put(s,stationTimeCount.getOrDefault(s,0)+1);   
            
    }
}

public double getAverageTime(String startStation, String endStation) {
    StringBuilder sb = new StringBuilder();
    sb.append(startStation);
    sb.append("-");
    sb.append(endStation);
    String s = sb.toString();
    if(stationTime.containsKey(s)){
        return (double)stationTime.get(s)/stationTimeCount.get(s);
    }
    else{
        return 0;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */