package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 50).sum());

		IntStream.rangeClosed(1, 50).max().ifPresent(System.out::println);

		LongStream.rangeClosed(1, 20).min().ifPresent(System.out::println);
		
		IntStream.rangeClosed(1, 50).average().ifPresent(System.out::println);
		
	}

}
 