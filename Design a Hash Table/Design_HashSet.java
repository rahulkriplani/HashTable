class MyHashSet {
    private List<Integer> list;
    public MyHashSet() {
        this.list = new ArrayList<Integer>(Collections.nCopies(1000001, -1));
    }
    
    public void add(int key) {
        this.list.add(key,1);
    }
    
    public void remove(int key) {
        this.list.add(key,-1);
    }
    
    public boolean contains(int key) {
        if(this.list.get(key) == 1)
            return true;
        else
            return false;
    }
}
