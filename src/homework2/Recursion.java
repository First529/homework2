package homework2;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	
	private static int i = 0;
	private static int j = 1;
	
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list.size() < 2)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(1);
			return unique(list);
		}
		return unique(list.subList(1, list.size()));
	}
	/**
	 * More effective way of finding fibonacci's number.
	 * @param n
	 * @param first
	 * @param next
	 * @return the fibonacci's number of n term.
	 */
	public static long add (int n,long first, long next) {
		if (n == 1) return next;
		return add( n - 1, next , first + next);
	}
	
	
	/**
	 * 
	 * @param n
	 * @return 
	 */
	public static long fibonacci (int n) {
		if (n == 0) return 0;
		return add(n ,0 ,1);
	}	
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("c");
		System.out.println(unique(list));
		System.out.println(fibonacci(20));
		
	}


}
