
import java.util.*;
import java.util.stream.*;

public class StreamObjectDemo {

	public static void main(String[] args) {
		
		//List , Set
		
//		List<Integer> list = new ArrayList<>();
//		list.add(12);
//		list.add(21);
//		list.add(33);
//		list.add(14);
//		list.add(11);
//		list.add(10);
//		list.add(18);
//		
//		Stream <Integer> stream1 = list.stream();
//		stream1.forEach(e -> {
//			System.out.println(e);
//		});
		
	//========filter and map() method============
		//filter(Predicate)
			//boolean value function (True or False)
			//e-> e
		
		//map(Function) return value
			/*
			 each element operation
			 */
		
		List<String> names = List.of("Akash","Hridoy","Salman","Raju","Abbas","Aslam");
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
					//OR	
//		newNames.stream().forEach(e->System.out.println(e));
		
		
	List<Integer> number = List.of(2,44,55,64,22,33,12);
	
		List<Integer> newNum = number.stream().map(i->i*2).collect(Collectors.toList());

//		System.out.println("Number :"+number);
//		System.out.println("Number Multiply by 2 :"+newNum);
						//OR
		newNum.forEach(e->System.out.println(e));
		
		//SORT
		number.stream().sorted().forEach(e-> System.out.println("Sorted Number : "+e));
		
		//MINIMUM VALUE
		Integer integer = number.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("Minimum value :"+integer);
		
		//MAXIMUM Value
		Integer integer1= number.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Maximum Value : "+integer1);
		
		

	}

}
