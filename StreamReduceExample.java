package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> list) {

		return list.stream().reduce(1, (x, y) -> x * y);
	}

	public static Optional<Integer> performMultiplicationOptional(List<Integer> list) {

		return list.stream().reduce((x, y) -> x * y);
	}

	public static Optional<Student> highestGpa() {
		// student one by one
		return StudentDataBase.getAllStudents().stream().reduce((x, y) -> (x.getGpa() > y.getGpa()) ? x : y);
	}

	public static void main(String[] args) {
		List<Integer> lstNumber = Arrays.asList(7, 4, 34, 56, 78, 12);
		List<Integer> lstNumber1 = new ArrayList<>();

		System.out.println(performMultiplication(lstNumber));
		Optional<Integer> opt = performMultiplicationOptional(lstNumber1);
		System.out.println(opt.isPresent());

		System.out.println(highestGpa().get());
	}
}
