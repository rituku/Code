package practice;

import java.util.Scanner;

public class Anagram {
	public static String removespace(String str) {
		String strg="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if((ch[i]) != ' ') {
			strg=strg+ch[i];
			}
		}
		System.out.println("&&&&&&&&&&&"+strg);
		return str;
	}
	public static void convertcase(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
			ch[i] = (char) (ch[i]-32);
			}
		}
		System.out.println(ch);
	}
	
	public static void sort(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] < ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	public static boolean compare(char ch1[], char ch2[]) {
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter first string");
	String str1=s.nextLine();
	System.out.println("enter second string");
	String str2=s.nextLine();
	String str3=removespace(str1);
	String str4=removespace(str2);
	char ch1[]=str3.toCharArray();
	char ch2[]=str3.toCharArray();
	if(ch1.length == ch2.length) {
		convertcase(ch1);
		convertcase(ch2);
		sort(ch1);
		sort(ch2);
		boolean c=compare(ch1, ch2);
		System.out.println(c);
	}
	//System.out.println("first string is"+ch1);

}
}
