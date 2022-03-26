package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeCloseExample {
	
	public static void main(String[] args) {
		//IntStream.range(1, 50).forEach(System.out::print);
		
		
		//IntStream.rangeClosed(1, 50).forEach(v->System.out.print(v+ ","));
		
		LongStream.range(1, 50).forEach(v->System.out.print(v+ ","));
		
		System.out.println();
		LongStream.rangeClosed(1, 50).forEach(v->System.out.print(v+ ","));
		System.out.println();
		
		IntStream.range(1, 50).asDoubleStream().forEach(System.out::print);
	}

}
