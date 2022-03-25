package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {
	public static List<String> namesList() {
		List<Student> listStudent = StudentDataBase.getAllStudents();
		String str= new String();
		return listStudent.stream()
				.map(Student::getName)
				.map(String::toLowerCase).
				collect(Collectors.toList());
		
		
		

	}
	
	
	public static Set<String> namesSet() {
		List<Student> listStudent = StudentDataBase.getAllStudents();
		String str= new String();
		return listStudent.stream()
				.map(Student::getName)
				.map(String::toLowerCase).
				collect(Collectors.toSet());
		
		
		

	}

	public static void main(String[] args) {
		System.out.println(namesList());
		
		System.out.println(namesSet() );
	}
}
