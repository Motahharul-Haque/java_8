package myJava.stream.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examp1 {

	public static void main(String[] args) {
		
		List<Student> lst = new ArrayList<>();
		lst.add(new Student("Rajiv", Subjects.SCIENCE, 45));
		lst.add(new Student("Rajiv", Subjects.MATH, 35));
		lst.add(new Student("Sneha", Subjects.SCIENCE, 29));
		lst.add(new Student("Rajiv", Subjects.COMPUTER, 40));
		lst.add(new Student("Sneha", Subjects.ENGLISH, 42));
		lst.add(new Student("Shashi", Subjects.MATH, 45));
		lst.add(new Student("Shashi", Subjects.COMPUTER, 43));
		lst.add(new Student("Shashi", Subjects.ENGLISH, 44));
		
		Map<String, List<Subjects>> map = new HashMap<>();
		
		lst.stream().forEach(stu -> {
			map.computeIfAbsent(stu.getName(),x -> new ArrayList<Subjects>())
			.add(stu.getSubjects());
		});
		
		System.out.println(map);
	}
}
