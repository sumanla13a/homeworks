package lesson9.labs.prob4;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {
	public Set<String> union(List<Set<String>> sets) {
		return sets.stream().flatMap(set -> set.stream()).collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		FlatMap flatmap = new FlatMap();
		Set<String> s1 = new TreeSet<String>();
		s1.add("A");
		s1.add("B");
		Set<String> s2 = new TreeSet<String>();
		s2.add("C");
		s2.add("D");
		Set<String> s3 = new TreeSet<String>();
		s3.add("1");
		s3.add("2");
		s3.add("3");
		List<Set<String>> s = new ArrayList<Set<String>>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(flatmap.union(s));
	}
}
