class SmallestInfiniteSet {
    HashSet<Integer> h;
    public SmallestInfiniteSet() {
        h = new HashSet<>();
        for(int i=1;i<=1000;i++){
            h.add(i);
        }
    }

    public int popSmallest() {
        int temp = Collections.min(h);
        h.remove(temp);
        return temp;
    }
    
    public void addBack(int num) {
        h.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */