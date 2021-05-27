package analatical;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LruExample {
	Set<Integer> cache; 
	int capacity;
	
	public LruExample(int arg) {
		this.cache = new LinkedHashSet<Integer>(capacity);
		this.capacity = arg;
	}

	public void put(int key) {
		
		if(cache.contains(key)) {
			cache.remove(key);
		}
		else if(cache.size() == capacity) {
			int first = cache.iterator().next();
			cache.remove(first);
		}
		cache.add(key);
	}
	
	public boolean get(int key) {
		if(!cache.contains(key)) {
			return false;
		}
		cache.remove(key);
		cache.add(key);
		return true;
	}
	
	public void display() 
    { 
        Iterator<Integer> itr = cache.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    }
	
	public void refer(int key) {
		
		if(get(key) == false) {
			put(key);
		}
	}

	public static void main(String[] args) {
		LruExample la = new LruExample(4);
		la.refer(1);
        la.refer(2); 
        la.refer(3); 
        la.refer(1); 
        la.refer(4); 
        la.refer(5); 
        la.display(); 
	}
}
