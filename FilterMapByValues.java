package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByValues {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jhon");
		map.put(2, "Smith");
		map.put(3, "Sally");
		map.put(4, "Prashant");
		map.put(5, "Ditya");
		map.put(6, "Ashwini");
		
		Map<Integer, String> result = map.entrySet()
				.stream()
				.filter(v -> (v.getValue().equals("Prashant") || v.getValue().equals("Ditya") || v.getValue().equals("Ashwini")))
				.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()));
		
		System.out.println("Result: " + result);
	}
	
}
