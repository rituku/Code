package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Findsubstring {
	public static boolean fiindstring(String str1, String str2) {
		ArrayList<String> inputarray= new ArrayList<String>(Arrays.asList(str1.split(" ")));
		//System.out.println(inputarray);

		Iterator il=inputarray.iterator();
		while(il.hasNext()) {
			Object o1=il.next();
			System.out.println(o1);
		}

		for(int i=0;i<inputarray.size();i++) {
			//System.out.println("inputarray="+inputarray);
		if(inputarray.contains(str2)) {
			System.out.println("substring found ="+str2);
			return true;
		}}
		return false;
	}
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=s.nextLine();
		System.out.println("enter second string");
		String str2=s.nextLine();
		fiindstring(str1, str2);
	}
}
