package employee.management.app.consumer;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Stud {
	String name;
	int rollno;

	Stud(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

public class BiFunctionExample {

	public static void main(String[] args) {
		ArrayList<Stud> l = new ArrayList<>();
		BiFunction<String, Integer, Stud> bi = (name, rollno) -> new Stud(name, rollno);
		l.add(bi.apply("Ayush", 1));
		l.add(bi.apply("Anant", 2));

		for (Stud s : l) {
			System.out.println(s.name + " " + s.rollno);

		}

	}

}
