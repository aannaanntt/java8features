//package streams;
//
//import java.util.List;
//import java.util.Map;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//public class StreamsExample {
//
//	public static void main(String[] args) {
//		Predicate<Student> pr = (s -> s.getGradeLevel() >= 3);
//		Predicate<Student> prp = (s -> s.getGpa() >= 3.9);
//		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream().peek(student -> {
//			System.out.println(student);
//		}).filter((sr) -> pr.test(sr)).peek(stud -> System.out.println("After first filter" + stud))
//				.filter(pi -> prp.test(pi)).peek(stud -> System.out.println("After second filter" + stud))
//				.collect(Collectors.toMap(Student::getName, Student::getActivities));
//
//		System.out.println(studentMap);
//
//	}
//}
