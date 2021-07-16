package myJava.stream.example;
public class Student {

	private String name;
	private Subjects Subjects;
	private int marks;
	public String getName() {
		return name;
	}
	public Subjects getSubjects() {
		return Subjects;
	}
	public int getMarks() {
		return marks;
	}
	public Student(String name, Subjects subj, int marks) {
		super();
		this.name = name;
		Subjects = subj;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Subjects=" + Subjects + ", marks=" + marks + "]";
	}

	
}
