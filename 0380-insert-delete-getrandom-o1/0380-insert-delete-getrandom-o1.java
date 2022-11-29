class RandomizedSet {
    HashSet<Integer> set = new HashSet<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        else {
                set.add(val);
                return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)) {
                set.remove(val);
                return true;
        }
        else{
                    return false;
        }
    }
    
    public int getRandom() {
        Iterator iterator = set.iterator();
        Random random = new Random();
        int x = random.nextInt(set.size());
        int j=0;
	while(iterator.hasNext()){
		int i = (int) iterator.next();
		if(j==x) return i;
                j++;
	}
            return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */