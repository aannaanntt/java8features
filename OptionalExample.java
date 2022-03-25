package optional;

import java.util.Optional;
import java.util.function.Supplier;

class Student {
	String name;
	Optional<Bike> bike = Optional.empty();

	public Optional<Bike> getBike() {
		return bike;
	}

	public void setBike(Optional<Bike> bike) {
		this.bike = bike;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Supplier<Student> getStuObj() {
		Supplier<Student> stu=()->{
		Bike bike = new Bike();
		bike.setName("Apache");
		bike.setModel("RTR 160");
		Student stud= new Student("Anant");
		stud.setBike(Optional.ofNullable(bike));
		return stud;
		};
		
		return stu;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", bike=" + bike + "]";
	}


}

public class OptionalExample {

	public static void main(String[] args) {
		String name = getName();
//       if(name!=null)
//       {
//       System.out.println(name.length());
//       }
//       else {
//    	   System.out.println("name not found");
//       }

		Optional<String> stringOptional = Optional.ofNullable(null);
		if (!stringOptional.isEmpty()) {
			System.out.println(stringOptional.get().length());
		}
	}

//	public static Optional<String> getStudentNameOptional() {
//		Optional<Student> stud = Optional.ofNullable(getStuObj());
//
//		if (stud.isPresent()) {
//			return Optional.empty();// Optional<String>
//
//		}
//		return null;
//
//	}

	private static String getName() {
		Student stu = null;

		if (stu != null) {
			return stu.getName();
		} else {
			return null;
		}
	}
}
