package lesson10.labs.Soln7_1;
import org.junit.Assert.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import org.junit.Test;
import lesson10.labs.prob7.*;
public class Soln1 {
	private static final List<Employee> finalEmployee = Arrays.asList(new Employee("Joe", "Stevens", 200000),
			new Employee("John", "Sims", 110000));
	@Test
	public void test1() {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
		          new Employee("John", "Sims", 110000),
		          new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000)).stream();
		String result = finalEmployee.stream()
						.map(e -> fullName(e)).sorted().collect(Collectors.joining(", "));
		// both works
//		assertEquals("These two should be equal ", result, Main.asString(emps));
		assertTrue("Return true ", equals(result, Main.asString(emps)));
	}
	private String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
	
	public boolean equals (String s1, String s2) {
		return s1.equals(s2);
	}
}
