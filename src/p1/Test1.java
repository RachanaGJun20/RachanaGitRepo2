package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(4);
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
	}

}
