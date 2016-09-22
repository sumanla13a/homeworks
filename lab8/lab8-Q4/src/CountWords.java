import java.util.*;

public class CountWords {
	public int countWords(List<String> words, char c, char d, int len) {
		int count = 0;
		for(String word : words) {
			if(word.length() == len && word.contains("" + c) && !word.contains("" + d)) count++;
		}
		return count;
	}
}
