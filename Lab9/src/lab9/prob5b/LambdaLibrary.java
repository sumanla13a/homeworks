package lab9.prob5b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaLibrary {
	public static final Function<List<Employee>, String> PICK_EMPLOYEE = (list) -> 
		list.stream()
			.filter(e -> e.getSalary() > 100000)
			.filter(e -> IntStream.rangeClosed('N', 'Z').anyMatch(c -> c == e.getLastName().charAt(0)))
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.collect(Collectors.joining(", "));
}
