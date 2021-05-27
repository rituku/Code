package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSort {
	
	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(2, "ritu", "java"));
		stu.add(new Student(4, "sona", "spring"));
		stu.add(new Student(3, "kiran", "j2ee"));
		
		Collections.sort(stu);
		
		for(Student st : stu) {
			System.out.println(st);
		}
	}

}
