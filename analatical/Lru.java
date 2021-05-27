package analatical;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lru {
	Set<Integer> cache;
	int capacity;
	
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
	
	public void refer(int key) {
		
		if(get(key) == false) {
			put(key);
		}
	}
	
	public void display() {
	  Iterator<Integer> inte = cache.iterator();
	  while(inte.hasNext()) {
		  System.out.print(inte.next()+ " ");
	  }
	}
	
	public Lru(int capacity) {
	    this.cache = new LinkedHashSet<Integer>(capacity);
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		Lru l = new Lru(4);
		l.refer(1);
		l.refer(2); 
        l.refer(3); 
        l.refer(1); 
        l.refer(4); 
        l.refer(5); 
        l.display();
	}
}
