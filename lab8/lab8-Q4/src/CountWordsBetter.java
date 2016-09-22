import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
public class CountWordsBetter {
	final BiFunction<Character, Character, Predicate<String>> containsLetter = (letter1, letter2) -> name -> name.contains("" + letter1) && !name.contains("" + letter2);
	public int countWordsBetter(List<String> words, char c, char d, int len) {
		 int count = (int)words.stream().filter(containsLetter.apply(c, d)).count();
		 return count;
	}
	public static void main(String[] args){
		List<String> words = new ArrayList<String>();
		words.add("Suman");
		words.add("Lamaa");
		words.add("sumy");
		CountWordsBetter countWord = new CountWordsBetter();
		System.out.println(countWord.countWordsBetter(words, 'm', 'y', 5));
	}
}
