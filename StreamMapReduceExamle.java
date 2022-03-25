package streams;

import java.util.Optional;

//public class StreamMapReduceExamle {
//	
//	public static Optional<Integer> getTotalBooks() {
//		//return StudentDataBase.getAllStudents().stream().filter(s->s.getNoteBooks()!=0).map(r->r.getNoteBooks()).reduce((x,y)->x+y);
//		
//		return StudentDataBase
//				.getAllStudents()
//				.stream()
//				.filter((q)->q.getGradeLevel()>=3)
//				.filter(e->e.getGender().equals("female"))
//				.map(Student::getNoteBooks) //Stream<Integer>
//				.reduce(Integer::sum);
//	
//	}
//	public static void main(String[] args) {
//		System.out.println(getTotalBooks().get());
//	}
//
//}
