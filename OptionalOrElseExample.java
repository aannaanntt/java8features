package optional;

import java.util.Optional;

public class OptionalOrElseExample {

	public static String optionalOrElse(){
		//Optional<Student> stu=Optional.ofNullable(Student.getStuObj());
		Optional<Student> stu = Optional.ofNullable(null);
		String name=stu.map(Student::getName).orElse("Default");
		
		return name;
	}
	
	
//	public static String optionalOrElseGet(){
//		Optional<Student> stu=Optional.ofNullable(Student.getStuObj());
//		//Optional<Student> stu = Optional.ofNullable(null);
//		String name=stu.map(Student::getName).orElseGet(()->"Default");
//		
//		return name;
//	}
	
	
	public static String optionalOrElseThrow(){
		//Optional<Student> stu=Optional.ofNullable(Student.getStuObj());
		Optional<Student> stu = Optional.ofNullable(null);
		String name=stu.map(Student::getName).orElseThrow(()->new RuntimeException("Name not found"));
		
		return name;
	}
//	public static void main(String[] args) {
//		System.out.println(optionalOrElse());
//		
//		System.out.println(optionalOrElseGet());
//		
//		System.out.println(optionalOrElseThrow());
//	}
}
