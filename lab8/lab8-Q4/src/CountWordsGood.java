import java.util.*;

public class CountWordsGood {
	public int countWordsGood(List<String> words, char c, char d, int len) {
		return (int)words.stream().filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)).count();
	}
	public static void main(String[] args){
		List<String> words = new ArrayList<String>();
		words.add("Suman");
		words.add("Lamaa");
		CountWordsGood countWord = new CountWordsGood();
		System.out.println(countWord.countWordsGood(words, 'm', 'y', 5));
	}
}
