//package streams;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StreamsFlateMapExample {
//	public static List<String> printStudentActivities(){
//		// return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
//	}
//	
//	public static long printStudentActivitiesCount(){
//		 return StudentDataBase.getAllStudents()
//				 .stream().//Stream<Student>
//				 map(Student::getActivities).//Stream<List<String>>
//				 flatMap(List::stream)//Stream<String>
//				 . distinct()//Stream<String> with distinct values
//				 .count();
//	}
//	public static void main(String[] args) {
//		System.out.println(printStudentActivities());
//		System.out.println(printStudentActivitiesCount());
//	}
//
//}
