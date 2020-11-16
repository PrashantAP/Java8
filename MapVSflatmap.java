package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVSflatmap {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Prashant", "Ashwini");
		System.out.println("list : "+list);
		
		List<String> list2 = list.stream()
				.map(s -> s.split(""))				// map will return Stream<String[]> 
				.flatMap(Arrays::stream)			// flatMap will return Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("list : "+list2);
		
	}

}
