import java.util.*;

public class CollectionSetDemo {

	public static void main(String[] args) {
		//Set Interface
		//Duplicate are not allowed
		//Insertion order not preserved
		
		// 1.HashSet 
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("Geeks");
//        hs.add("For");
//        hs.add("Geeks");
//        hs.add("Is");
//        hs.add("Very helpful");
//        
//        Iterator<String> itr = hs.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        
        // 2. LinedHashSet
//        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
//    	lhs.add("Geeks");
//        lhs.add("For");
//        lhs.add("Geeks");
//        lhs.add("Is");
//        lhs.add("Very helpful");
//        
//        Iterator<String> itr = lhs.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        
        // 3. Sorted Set = TreeSet
        TreeSet<String> ts = new TreeSet<String>();
        
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");
 
        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}

}
