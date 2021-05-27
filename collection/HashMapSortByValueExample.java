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

public class HashMapSortByValueExample {
	public static HashMap sortByValues(HashMap hashmap) {
		List lst = new LinkedList(hashmap.entrySet());
		 // Defined Custom Comparator here
		Collections.sort(lst, new Comparator() {
		
			public int compare(Object o1, Object o2) {
				return (((Comparable) ((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue()));
			}
		});
		
		HashMap sortedMap = new LinkedHashMap();
		
		for (Iterator iterator = lst.iterator(); iterator.hasNext();) {
			Map.Entry sotmap = (Map.Entry)iterator.next();
			sortedMap.put(sotmap.getKey(), sotmap.getValue());
		}				
		return sortedMap;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ritu");
		map.put(3, "somit");
		map.put(2, "uday");
		map.put(5, "kiran");
		map.put(4, "rishav");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
		Map.Entry pair = (Map.Entry)it.next();
		System.out.println(pair.getKey()+"  "+pair.getValue());			
		}		
		
		Map<Integer, String> hashmap = sortByValues(map);
		System.out.println();
		Set set2 = hashmap.entrySet();
		Iterator itr = set2.iterator();
		while (itr.hasNext()) {
			Map.Entry mtr = (Map.Entry)itr.next();
			System.out.println(mtr.getKey()+" "+mtr.getValue());
			
		}
				
	}
}
