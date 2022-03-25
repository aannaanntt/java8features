package employee.management.app;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {
	String name;
	String hero;
	String heroine;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", heroine=" + heroine + "]";
	}

	public static void populate(ArrayList<Movie> al) {
		al.add(new Movie("Haramkhor", "Nawaz", "kareena"));
		al.add(new Movie("3 idiots", "Amir", "kareena"));
		al.add(new Movie("heroine", "Arjun Rampal", "kareena"));

	}

	public static void printDetails(Consumer<Movie> c1, ArrayList<Movie> list) {
		for (Movie m : list) {
			c1.accept(m);
		}
	}

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();

		Movie.populate(list);

		Consumer<Movie> c1 = c -> System.out.print(c);

		Movie.printDetails(c1, list);
	}

}
