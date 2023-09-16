import java.util.*;

public class CollectionListDemo {

	public static void main(String[] args) {

		// List Interface
		// Duplicate allow
		// Insertion Order Preserved

		// 1. Array List

//		ArrayList<Integer> al = new ArrayList<Integer>();
//		for (int i = 1; i <= 5; i++)
//
//			al.add(i);
//			System.out.println(al);					 // Displaying the ArrayList
//		 
//			al.remove(3);
//			System.out.println(al);
//			
//		for (int i = 0; i < al.size(); i++) {			// Printing elements one by one
//	        System.out.print(al.get(i) + " ");

		// 2. Linked List
//		LinkedList<Integer> ll = new LinkedList<Integer>();
//	        
//	        for (int i = 1; i <= 5; i++)
//
//				ll.add(i);
//				System.out.println(ll);					 // Displaying the ArrayList
//			 
//				ll.remove(3);
//				System.out.println(ll);
//				
//			for (int i = 0; i < ll.size(); i++) {			// Printing elements one by one
//		        System.out.print(ll.get(i) + " ");
//	        
//		}

		// 3. Vector

//		Vector<Integer> v = new Vector<Integer>();
//		for (int i = 1; i <= 5; i++)
//			v.add(i);
//		System.out.println(v);
//		v.remove(3);
//
//		System.out.println(v);
//
//		for (int i = 0; i < v.size(); i++)
//		System.out.print(v.get(i) + " ");
		
		// 4. Stack
		
		 Stack<String> stack = new Stack<String>();
	        stack.push("Geeks");
	        stack.push("For");
	        stack.push("Geeks");
	        stack.push("Geeks");
	        
	        Iterator<String> itr = stack.iterator();
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	        
	        System.out.println();
	        
	        stack.pop();
	        itr = stack.iterator();
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	}

}
