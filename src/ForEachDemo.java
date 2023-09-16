import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String [] args) {
		
	//Enhanced for 1D Array (External Loop)
		
//		int a[]= {2,5,8,3,6};
//		
//		 for(int b : a) {
//			 System.out.println(b);
//		 }
		
		
		//Enhanced for 2D Array (External Loop)
//		
//		int b[]= {1,3,5,7,9};
//		int c[]= {2,4,6,8,6};
//		int d[]= {1,2,3,4,5};
//		
//		int e[][]= {
//				{1,3,5,7,9},
//				{2,4,6,8,6},
//				{1,2,3,4,5}
//		};
//		for(int k[] : e ) {
//			for (int m : k) {
//				System.out.print(" "+m);
//			}
//			System.out.println();
//		}
		 
		// ForEach Method (Internal Loop)
		
		List<Integer> nums = Arrays.asList(2,4,5,6,78,99);
		
		nums.forEach(n -> System.out.println(n));
		

	}

}
