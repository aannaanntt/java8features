package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

//	public static int maxValue(List<Integer> lst) {
//		return lst.stream().reduce(0, (x, y) -> (x > y) ? x : y);
//
//	}
	
	public static Optional<Integer> minValue(List<Integer> lst) {
		return lst.stream().reduce( (x, y) -> (x < y) ? x : y);

	}
	
	
//	
//	public static Optional<Integer> maxValueOptional(List<Integer> lst) {
//		return lst.stream().reduce( (x, y) -> (x > y) ? x : y);
//
//	}
	public static void main(String[] args) {
		//List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
//		maxValueOptional(integerList).ifPresentOrElse(System.out::println, ()->{
//			
//			System.out.println("value is empty");
//		});;
		
		minValue(integerList).ifPresentOrElse(System.out::println, ()->
		System.out.println("Value is empty"));;
	}

}
