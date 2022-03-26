package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
	
	public static void boxing() {
	List<Integer> lst=IntStream.rangeClosed(1,10)
				.boxed().collect(Collectors.toList());;
				
				
				unBoxing(lst);
	}
	
	public static void unBoxing(List<Integer> lst) {
		lst.stream()
			.mapToInt(Integer::intValue).forEach(s->System.out.println("Unboxing"+" "+s));;
	 
	}
	
	public static void main(String[] args) {
		boxing();
	}
}
