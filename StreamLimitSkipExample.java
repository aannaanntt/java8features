package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> lst) {
		return lst.stream().limit(3).reduce((x, y) -> x + y);
	}

	public static void skip(List<Integer> lst) {
		 lst.stream().skip(2).reduce((x, y) -> x + y).ifPresentOrElse(System.out::println, () -> System.out.println("Not exist"));;
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(5, 4, 6, 7, 8, 9, 12);

		limit(integers).ifPresentOrElse(System.out::println, () -> System.out.println("not exist"));
		skip(integers);
	}

}
