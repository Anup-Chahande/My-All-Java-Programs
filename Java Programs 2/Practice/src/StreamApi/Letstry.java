package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Letstry {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(7);
		al.add(4);


		List<Integer> Filter = al.stream().filter(c -> c != 2).collect(Collectors.toList());
		System.out.println(Filter); // add the condition in array/collection
		List<Integer> Map = Filter.stream().map(x -> x + 1).collect(Collectors.toList()); // change value of																				// collection/array
		System.out.println(Map);
		List<Integer> Distint = Filter.stream().distinct().collect(Collectors.toList()); 
		System.out.println(Distint); //remove duplicates
		List<Integer> Sort = Filter.stream().sorted().collect(Collectors.toList());
		System.out.println(Sort); //Sort Elements 
		
		//you can also do this all stuff in one line

		// collect(Collectors.toList()) only accept in List 
		
		
		
		
		
		
		
// This is also work : - 
//		Stream<Integer> streamcreated = al.stream().filter(c -> c != 4);
//	     List<Integer> al2 = streamcreated.collect(Collectors.toList());
//	        System.out.println(al2);
	}

}
