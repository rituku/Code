package collection;

public class Student implements Comparable {

	private int id;
	private String name;
	private String book;
	public Student(int id, String name, String book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student st = (Student)o;
		
		return this.id - st.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
	
}
