package lesson9.labs.prob1;
import java.util.stream.*;
import java.util.*;
public class Main {
	public final static IntStream getStream () {
		return IntStream.of(1,10,3,2,4,5);
	}
	public static void main(String[] args) {
		// Qa: creates infinite number of ones and the program is in infinite loop. Distinct keeps on waiting. Add limit
		IntStream ones = IntStream.generate(() -> 1).distinct().limit(1);
		ones.forEach(System.out::println);
		
		// Qb
		List<String> list = new ArrayList<String>();
		list.add("Bill");
		list.add("Thomas");
		list.add("Mary");
		String finalString = list.stream().reduce("", (s1, s2) -> s1 + s2 + ", ");
		System.out.println(finalString);
		
		// Qc
		System.out.println("Max: " + Main.getStream().max().getAsInt());
		System.out.println("Min: " + Main.getStream().min().getAsInt());
		/*This closes the stream in first shot
		 * System.out.println(myIntStream.max());
		System.out.println(myIntStream.min());*/
	}
	
}
