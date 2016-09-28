package lab11.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(6, 10, 2, 5, 7, 14, 7));
		System.out.println(secondSmallest(ints));
	}
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
		T min = list.get(0);
		T min2 = list.get(0);
		
		for(T item: list){
			int result = item.compareTo(min);
			if(result == 0) continue;
			else if(result < 0){
				min2 = min;
				min = item;
			}
			else if(item.compareTo(min2) < 0){
				min2 = item;
			}
		}
		
		return min2;
	}
}
