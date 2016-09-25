package lesson9.labs.prob7b;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;
public class LambdaLibrary {
	public static final Function<List<Employee>, List<Employee>> EmpFilter = (list) ->
		list.stream()
			.filter(emp -> emp.getSalary() >= 100000 && emp.getLastName().matches("^[N-Z].*"))
			.sorted((m, n)->m.getLastName().compareTo(n.getLastName()))
			.collect(Collectors.toList());
		
}
