package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HashMapSortByValue {
	public static HashMap sortByValue(HashMap map) {
		List lst = new LinkedList(map.entrySet());
		
		Collections.sort(lst, new Comparator() {

			public int compare(Object o1, Object o2) {			
				return (((Comparable) ((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue()));
			}
			
		});
		
		HashMap sorted = new LinkedHashMap();
		for (Iterator iterator = lst.iterator(); iterator.hasNext();) {
			Map.Entry mtr = (Map.Entry)iterator.next();
			sorted.put(mtr.getKey(), mtr.getValue());
		}
		
		return sorted;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(22, "rita");
		hashmap.put(44, "somit");
		hashmap.put(11, "mona");
		
		Set set = hashmap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
		Map.Entry mt = (Map.Entry)it.next();
			System.out.println(mt.getKey()+" "+mt.getValue());
		}
		
		//Map<Integer, String> hashmap1 = sortByValues(hashmap);
		Map<Integer, String> newhashmap = sortByValue(hashmap);
		System.out.println();
		Set set2 = newhashmap.entrySet();
		Iterator ity = set2.iterator();
		while (ity.hasNext()) {
		Map.Entry my = (Map.Entry)ity.next();
		System.out.println(my.getKey()+" "+my.getValue());
		}
	}

}
