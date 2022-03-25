package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStreams {
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Jim");
		list.add("Jenny");
		//list.remove(0);
		
		System.out.println(list);
		
		Stream<String>listStream=list.stream();
		listStream.forEach(System.out::println);
		listStream.forEach(System.out::println);
	}
}
