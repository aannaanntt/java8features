package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
	public static List<Student> getStudentBySortedOrder(){
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}
	
	public static List<Student> getStudentByGpa(){
	
			return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
		
	}
	
	
	public static List<Student> getStudentByGpaReverse(){
		
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
	
}
	public static void main(String[] args) {
		System.out.println(getStudentBySortedOrder());
		
		getStudentByGpa().forEach(System.out::println);
		System.out.println("Reverse Order"+" "+getStudentByGpaReverse());
	}

}
