class Gettersetter {
  
	private String name;
	private int rollNo;
    private double marks;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}

public class Student {
	public static void main(String[] args) {
		Gettersetter s1 = new Gettersetter();
		s1.setName("John");
		s1.setRollNo(101);
		s1.setMarks(85.5);
		
		System.out.println("Name: " + s1.getName());
		System.out.println("Roll No: " + s1.getRollNo());
		System.out.println("Marks: " + s1.getMarks());
	}
}