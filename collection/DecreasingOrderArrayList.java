package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecreasingOrderArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("orange");
		arr.add("apple");
		arr.add("cake");
		arr.add("lichi");
		
		Collections.sort(arr);
		
		for (String st : arr) {
		System.out.println(st);	
		}
		
		System.out.println();
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
