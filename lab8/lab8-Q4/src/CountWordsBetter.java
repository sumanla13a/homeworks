import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class CountWordsBetter {
	final Function<String, Predicate<String>> containsLetter = letter -> name -> name.contains("" + letter);
	final Function<String, Predicate<String>> doesnotContainLetter = letter -> name -> !name.contains("" + letter);
}
