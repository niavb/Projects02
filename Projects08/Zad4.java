package projects08;

import java.util.PriorityQueue;

public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> list = new PriorityQueue<String>();
		list.offer("George");
		list.offer("Jim");
		list.offer("John");
		list.offer("Blake");
		list.offer("Kevin");
		list.offer("Michael");
		
		PriorityQueue<String> list2 = new PriorityQueue<String>();
		list2.offer("George");
		list2.offer("Katie");
		list2.offer("Kevin");
		list2.offer("Michelle");
		list2.offer("Ryan");
		
		System.out.println("Intersection: " + findIntersection(list, list2));
		System.out.println("Difference: " + findDifference(list, list2));
		System.out.println("Union: " + findUnion(list, list2));

	}
	
	public static PriorityQueue <String> findUnion(PriorityQueue <String> list1, PriorityQueue <String> list2) {
		PriorityQueue <String> union = new PriorityQueue <String>();
		union.addAll(findDifference(list1, list2));
		union.addAll(findIntersection(list1, list2));
		return union;
	}
	
	public static PriorityQueue <String> findDifference(PriorityQueue <String> list1, PriorityQueue <String> list2) {
		PriorityQueue <String> difference = new PriorityQueue <String> (list1);
		difference.addAll(list2);
		difference.removeAll(findIntersection(list1, list2));
		return difference;
	}
	
	public static PriorityQueue <String> findIntersection(PriorityQueue <String> list1, PriorityQueue <String> list2) {
		PriorityQueue <String> copyList1 = new PriorityQueue <String> (list1);
		copyList1.retainAll(list2);
		return copyList1;
	}

}
