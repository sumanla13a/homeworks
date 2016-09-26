package lab9.prob6;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaLibrary {
	public static final Function<List<Employee>, Long> PICK_EMPLOYEE = (list) -> 
		list.stream()
			.filter(e -> e.getSalary() > 100000)
			.filter(e -> IntStream.rangeClosed('F', 'Z').anyMatch(c -> c == e.getLastName().charAt(0)))
			.count();

		public static final Function<List<Employee>, String> PICK_EMPLOYEE2 = (list) -> 
		list.stream()
			.filter(e -> e.getSalary() > 85000)
			.filter(e -> IntStream.rangeClosed('A', 'Q').anyMatch(c -> c == e.getLastName().charAt(0)))
			.map(e -> e.getFirstName().toUpperCase() + " " + e.getLastName().toUpperCase())
			.sorted()
			.collect(Collectors.joining(", "));
}
