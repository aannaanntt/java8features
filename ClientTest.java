package comparatormethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ClientTest {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Carter", "james", "Travis", "Davis", "Zora", "Bary");
//
//		Comparator<String> comp = Comparator.comparingInt(String::length);
//
//		Collections.sort(list, comp);
//
//		list.forEach(System.out::println);
		
		ArrayList<Map<Integer,Integer>> al= new ArrayList<>();
		Map<Integer,Integer> maps= new LinkedHashMap<>();
		maps.put(1,2);
		maps.put(1,2);
		maps.put(1,2);
		maps.put(1,2);
		al.add(maps);

		
		al.forEach(System.out::println);
	ListIterator<Map<Integer,Integer>>list=al.listIterator();
	
	while(list.hasNext()) {
		list.forEachRemaining(System.out::println);
	}
	
	}
}
