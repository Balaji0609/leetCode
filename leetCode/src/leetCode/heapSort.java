package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class heapSort {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int[] arr = new int[8];
		int i = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Arrays.asList(1,2,3,8,3,2,9,5));
		
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2){
					return -1;
				} else if(o1 < o2){
					return 1;
				}
				// TODO Auto-generated method stub
				return 0;
			}
		};
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(c);
		pq1.addAll(Arrays.asList(1,2,3,8,3,2,9,5));
		while(pq1.size() > 0){
			System.out.println(pq1.poll());
			
		}
		
		System.out.println("   \n \n ");
		while(pq.size() > 0){
			System.out.println(pq.poll());
			
		}
		//while(pq.)
		
		
		
		// TODO Auto-generated method stub

	}

}
