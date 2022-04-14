
import java.util.*;

public class ArrayToListToSet {
	public static void main(String[] args) {
		List li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(20);
		li.add(20);
		li.add(50);
		li.add(20);
		li.add(20);
		li.add(20);
		li.add(40);
		Set<Integer> s = new LinkedHashSet<>();

		for (int i = 0; i < li.size(); i++) {
			s.add((Integer) li.get(i));

		}
		System.out.println(s);
		System.out.println();
		System.out.println(li.size());
		System.out.println();
		System.out.println(li.get(li.size() - 1));
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(li.get(i));

		}
		System.out.println();
		System.out.println(li.get((li.size() - 1) / 2));
		System.out.println();
		for (int i = li.size() - 5; i <= li.size() - 1; i++) {

			System.out.println(li.get(i));

		}
		System.out.println();
		for (int i = 0; i < li.size(); i = i + 2) {
			System.out.println(li.get(i));

		}
		
	}

}
