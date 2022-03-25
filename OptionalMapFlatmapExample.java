package optional;

import java.util.Optional;

class Bike {
	public String name;
	public String Model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", Model=" + Model + "]";
	}

}

public class OptionalMapFlatmapExample {
	public static void optionalFilter() {
		Optional<Student> stu = Optional.ofNullable(Student.getStuObj().get());

		Optional<String> opt=stu.filter(student -> stu.get().getName() != null).flatMap(Student::getBike).map(Bike::getName);
		
		System.out.println(opt.get());
	
	}

	public static void optionalMap() {
		Optional<Student> stu = Optional.ofNullable(Student.getStuObj().get());

		if (stu.isPresent()) {
			Optional<String> opt = stu.filter(student -> student.getName() != null).map(Student::getName);

			System.out.println(opt.get());
		}
	}
	
	public static void optionalFlatMap() {
		Optional<Student> stud=Optional.ofNullable(Student.getStuObj().get());
	}
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
	}
}