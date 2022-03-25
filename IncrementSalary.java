package employee.management.app.consumers;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class IncrementSalary {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);
		BiConsumer<Employee, Double> c = (e, increment) -> e.salary = e.salary + increment;
		Consumer<Employee> consume = (e) -> System.out.println(e+"\n");
		al.add(f.apply("Durga", 300000.00));
		al.add(f.apply("Sunny", 30000.0));
		al.add(f.apply("Bunny", 4500.00));
		al.add(f.apply("Chinny", 36000.00));

		for (Employee e : al) {
			c.accept(e, 500.0);
		}

		for (Employee e : al) {
			consume.accept(e);
		}

	}

}
