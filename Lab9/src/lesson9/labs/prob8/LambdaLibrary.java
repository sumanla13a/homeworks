package lesson9.labs.prob8;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;
public class LambdaLibrary {
	public static final Function<List<Employee>, Long> countHighSalaryEmpLastNameEplus = (list) ->
		list.stream()
		.filter(emp -> emp.getSalary() > 100000 && emp.getLastName().toUpperCase().matches("^[E-Z].*"))
		.count();
	
	public static final Function<List<Employee>, List<Employee>> filterEmployeeMidSalary = (list) ->
		list.stream()
			.filter(emp -> emp.getSalary()>85000 && emp.getFirstName().toUpperCase().matches("^[A-R].*"))
			.collect(Collectors.toList());
}
