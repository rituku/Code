package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByKeyExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(22, "ritu");
		hashmap.put(11, "rishav");
		hashmap.put(44, "shalu");
		hashmap.put(12, "somit");
		
		System.out.println(hashmap);
		Set set = hashmap.entrySet();
		//System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext()) {		
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey());
		}
		
		Map<Integer, String> tree = new TreeMap<Integer, String>(hashmap);
		System.out.println(tree);
	}
}
