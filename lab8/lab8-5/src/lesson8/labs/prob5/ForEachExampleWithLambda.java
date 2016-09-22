package lesson8.labs.prob5;

import java.util.Arrays;
import java.util.List;


public class ForEachExampleWithLambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		// answer to 5i
		list.forEach((String s) -> System.out.println(s.toUpperCase()));
	}
	
	
	
}