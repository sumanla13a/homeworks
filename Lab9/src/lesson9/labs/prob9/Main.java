package lesson9.labs.prob9;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Book book = new Book("test", 1);
		List<BookCopy> copiesBook = book.getCopies();
		copiesBook.forEach(copy->copy.changeAvailability());
		System.out.println(book.isAvailable());
	}
	
}
