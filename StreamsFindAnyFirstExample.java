package streams;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3.9)
		.findAny();
	}
	
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3.9)
		.findFirst();
	}
	public static void main(String[] args) {
		//findAnyStudent().ifPresentOrElse(System.out::println, ()->System.out.println("Not present"));
		
		findFirstStudent().ifPresentOrElse(System.out::println, ()->System.out.println("Not present"));
	}
}
