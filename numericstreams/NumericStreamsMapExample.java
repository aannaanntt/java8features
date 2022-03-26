package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {
	
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 5)
		.mapToObj(i->new Integer(i)).collect(Collectors.toList());
	}
	
	
	public static long mapToLong() {
		
		return IntStream.rangeClosed(1, 10)
		.mapToLong((i)-> i) //convert int to long
		.sum();
	}
	
	
	public static double mapToDouble() {
		
		return IntStream.rangeClosed(1, 10)
		.mapToDouble((i)-> i) //convert int to long
		.sum();
	}
	
	public static void main(String[] args) {
		System.out.println(mapToObject());
		System.out.println(mapToLong());
		
		System.out.println(mapToDouble());
	}
}
