package streams;

import java.util.List;

public class StreamsFilterExample {
	public static List<Student> filterStudents(){
		return  StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3.9).toList();
	}
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);
	}

}
