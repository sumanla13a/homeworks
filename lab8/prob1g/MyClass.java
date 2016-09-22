package lab8.prob1g;

import java.util.function.*;

public class MyClass {
	private int f;
	
	public MyClass(int f) {
		super();
		this.f = f;
	}

	public boolean myMethod(MyClass cl) {
		Function<Object, Boolean> f = this::equals;// (o) -> this.equals(o);		
		return f.apply(cl);
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof MyClass)) return false;
		MyClass cl = (MyClass)ob;
		return this.f == cl.f;
	}
}