package collection;

import java.util.Comparator;

public class Employee {
	private int emid;
	private String emname;
	private String emtype;
	public Employee(int emid, String emname, String emtype) {
		super();
		this.emid = emid;
		this.emname = emname;
		this.emtype = emtype;
	}
	
	public static Comparator<Employee> comByName = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			
			return e1.emname.compareTo(e2.emname);
		}
	};
	
	public static Comparator<Employee> comById = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			return e1.emid - e2.emid;
		}				
	};
	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", emname=" + emname + ", emtype=" + emtype + "]";
	}
	
	

}
