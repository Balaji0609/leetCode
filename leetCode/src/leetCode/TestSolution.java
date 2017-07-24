package leetCode;

import java.util.*;
public class TestSolution {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		HashMap<Integer, Character> hm = new HashMap<Integer,Character>();
		hm.put(1,'1');
		hm.put(2,'1');
		hm.put(3,'1');
		hm.put(4,'1');
		hm.put(5,'1');
		for (Map.Entry me : hm.entrySet()) {
			int k = (int)me.getKey();
			/*if (me.getValue() == '1') {
				System.out.println("yes");
			}*/
			System.out.println("key is : "+ k);
		}
		return;
	}
}
