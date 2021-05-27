package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCompratorSort {

	public static void main(String[] args) {
		ArrayList<Employee> ary = new ArrayList<Employee>();
		ary.add(new Employee(24, "uday", "manager"));
		ary.add(new Employee(43, "rishav", "lead"));
		ary.add(new Employee(25, "kiran", "preman"));
		
		Collections.sort(ary, Employee.comById);
		
		for (Employee emp : ary) {
			System.out.println(emp);
		}
		
       Collections.sort(ary, Employee.comByName);
		
		for (Employee emp : ary) {
			System.out.println(emp);
		}
	}
}
