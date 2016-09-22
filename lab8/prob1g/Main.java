package lab8.prob1g;

public class Main {
	public static void main(String[] args) {
		MyClass cl1 = new MyClass(2);
		MyClass cl2 = new MyClass(2);
		MyClass cl3 = new MyClass(3);

		System.out.println(cl1.myMethod(cl2));
		System.out.println(cl1.myMethod(cl3));
	}
}
