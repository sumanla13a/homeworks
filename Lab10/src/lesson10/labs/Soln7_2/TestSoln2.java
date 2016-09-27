package lesson10.labs.Soln7_2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class TestSoln2 {
	private static final List<Employee> finalEmployee = Arrays.asList(new Employee("Joe", "Stevens", 200000),
			new Employee("John", "Sims", 110000));
	@Test
	public void testSoln2Salary() {
		List<Employee> empsSalary = Arrays.asList(
		          new Employee("John", "Sims", 110000),
		          new Employee("Joe", "Stevens", 200000),
              new Employee("Andrew", "Reardon", 80000));

		assertTrue("This should be true ", salaryTest(empsSalary));
	}

	public boolean salaryTest(List<Employee> emp) {
		String test1 = Main.asString(emp.stream());
		String test2 = finalEmployee.stream()
				.map(e -> fullName(e)).sorted().collect(Collectors.joining(", "));
		return test1.equals(test2);
	}
	
	private String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
}
