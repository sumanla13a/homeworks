package lesson9.labs.prob2;

import java.util.stream.IntStream;

public class PrintSquares {
	public static void printSquares(int num) {
		IntStream.rangeClosed(1, num).forEach(n->System.out.println(n*n));
		IntStream.iterate(1, n -> n+1).limit(num).forEach(n->System.out.println(n*n));
	}
	
	public static void main(String[] args) {
		PrintSquares pS = new PrintSquares();
		pS.printSquares(3);
	}
}
