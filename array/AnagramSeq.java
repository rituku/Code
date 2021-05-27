package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramSeq {
	public static void findAnagramSeq(String arr[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
			
        	String word = arr[i];
        	char[] ch = word.toCharArray();
        	Arrays.sort(ch);
        	String s = new String(ch);
        	
        	if(map.containsKey(s)) {
        		map.get(s).add(word);
        	}
        	else {
        		List<String> words = new ArrayList<>();
        		words.add(word);
        		map.put(s, words);
        	}
		}
        for (String st : map.keySet()) {
			List<String> wordarr = map.get(st);
			if(wordarr.size() > 1) {
				System.out.println(wordarr);
			}
		}
	}
	public static void main(String[] args) {

		String arr[] = { "cat", "dog", "tac", "god", "act" }; 
		findAnagramSeq(arr);
	}
}
