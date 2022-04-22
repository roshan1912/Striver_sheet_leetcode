class MyHashMap {
    int arr[];
    public MyHashMap() {
        arr = new int[100];
    }
    
    public void put(int key, int value) {
        if(arr.length<=key)
            extend(key);
        arr[key]=value+1;
        
    }
    
    public int get(int key) {
        if(key>=arr.length)
             extend(key);
        return arr[key]-1;
    }
    
    public void remove(int key) {
       if(key>=arr.length)
             extend(key);
        arr[key]=0;
    }
    public void extend(int key){
        arr= Arrays.copyOf(arr, key+2); 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */