


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		// with using list.of,it is immutable in nature .we cannot add the lists .
		List<Integer> list1 = List.of(4, 56, 75, 156, 865,5,365,364,3,6,3,6,3,6,4,3,64,53,6,4,2,63,624,6,6,4,46,57,5,2,7357,24,75,724,6,7,2,47,37,24,65,742,427,5,624,7,24,7,7,246,247,24,7,24,62,7,536,1,672,672,7,62,7,2,644,7254,675,624,7,42,725,7,2,6735,724,75,724,75,72,7,2,675,725,72,7);
		System.out.println(list1);

//if we have filter all even numbers from list1 ,then we have make a new list and add even numbers from list1 by filtering 

		//without stream api 
		List<Integer> list4=new ArrayList();
	for (Integer integer : list1) {
		if (integer%2==0) {
			list4.add(integer);
			
		}
		
	}
	System.out.println(list4);
	
	//same work with stream api 
		Stream<Integer> stream=list1.stream();
		List<Integer> list5=stream.filter(i->i%2==0).collect(Collectors.toList());
System.out.println(list5);
	}

	
	
	
}
