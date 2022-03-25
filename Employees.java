package employee.management.app;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employees {

	String name;
	double salary;

	public Employees(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + "]";
	}

	public static void populate(ArrayList<Employees> list) {
		list.add(new Employees("Durga", 100000));
		list.add(new Employees("Sunny", 50000));
		list.add(new Employees("Bunny", 30000));
		list.add(new Employees("Mark", 25000));
		list.add(new Employees("Ben", 25000));
	}

	public static void sumOfSalary(Function<ArrayList<Employees>, Double> f, ArrayList<Employees> list) {
		System.out.println("Total salary of all employees\s " + f.apply(list));
	}

	public static ArrayList<Employees> salaryLess3500(Predicate<Employees> p, ArrayList<Employees> al) {
		ArrayList<Employees> l = new ArrayList<Employees>();
		for (Employees e : al) {
			if (p.test(e)) {
				l.add(e);
			}
		}
		return l;

	}

	public static void afterIncrement(Function<Employees, Employees> f1, ArrayList<Employees> l) {
		for (Employees e : l) {
			System.out.println("Salary after increment" + " " + f1.apply(e));
		}
	}

	public static void main(String[] args) {

		ArrayList<Employees> al = new ArrayList<Employees>();

		populate(al);
		System.out.println("Salary before increment\n" + al);

		Function<ArrayList<Employees>, Double> f = l -> {
			double total = 0;
			for (Employees e : al) {
				total += e.salary;
			}
			return total;

		};
		sumOfSalary(f,al);

		Predicate<Employees> p = e -> e.salary < 35000;
		ArrayList<Employees> ala = salaryLess3500(p, al);
		System.out.println(ala);
		Function<Employees, Employees> f1 = e -> {
			e.salary = e.salary + 477;
			return e;
		};

		afterIncrement(f1, ala);

	}
}
