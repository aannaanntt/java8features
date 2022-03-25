package employee.management.app;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee  name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Durga", "CEO", 100000, "Hyedrabad"));
		list.add(new Employee("Sunny", "Manager", 50000, "Bangalore"));
		list.add(new Employee("Bunny", "Sr.Software Engg", 30000, "Bangalore"));
		list.add(new Employee("Mark", "Software Engg", 25000, "Moradabad"));
		list.add(new Employee("Ben", "Software Engg", 25000, "Delhi"));
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println(
				"********************************************************************************************************************");
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);

		Predicate<Employee> managerPredicate = employee -> employee.designation.equals("Manager");
		Predicate<Employee> diplayBangalore = emp -> emp.city.equals("Bangalore");
		Predicate<Employee> salaryPredicate = emp -> emp.salary < 30000;
		Predicate<Employee> isCEO =Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyedrabad"));
		// display(managerPredicate, list);
		// display(diplayBangalore,list);
//		System.out.println("All employees information with salary less than 20000\n****************************************************************************************");
//		display(salaryPredicate, list);
		//display(managerPredicate.and(diplayBangalore), list);
		//display(managerPredicate.or(salaryPredicate), list);
		//display(managerPredicate.negate(), list);
		// System.out.println(list.toString());
		Employee e1 = new Employee("Mark", "Software Engg", 25000, "Moradabad");
		System.out.println(isCEO.test(e1));
	}

}
