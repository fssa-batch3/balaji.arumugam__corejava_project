package day12.solved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		
		Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

		
		set1.retainAll(set2);
		
		System.out.println(set1);

	
	}

}
