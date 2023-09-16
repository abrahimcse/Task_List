import java.util.*;

public class StreamAPIDemp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,5,7,8,1,3);
		
		nums.stream()
			.filter(n -> n%2==1)
			.sorted()
			.map(n -> n*2)  						//map() method used for transformation (Intermediate Method)
			.forEach(n -> System.out.println(n));

	}

}
