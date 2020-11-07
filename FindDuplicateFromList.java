package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> hset = new HashSet<>();
		
		System.out.println("Type 1");
		Set<Integer> set1 = list.stream().filter(i -> !hset.add(i)).collect(Collectors.toSet());
		set1.forEach(System.out::println);
		
		System.out.println("Type 2");
		Set<Integer> set2 = list.stream().filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());
		set2.forEach(System.out::println);
	}

}
