import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = List.of(22,12,23,36,63,65,66);
		
		System.out.println(list1);
		
		//to filter even numbers only
		System.out.println("Filter even numbers");
		List<Integer> newlist = list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		
		
		//to print even numbers
		System.out.println(newlist);
		
		//to print numbers greater than 50
		System.out.println("greater than 50");
		List<Integer> newList1 = list1.stream().filter(i-> i>50).collect(Collectors.toList());
		System.out.println(newList1);
		
		//print using object
		System.out.println("using object");
		Stream<Integer> stream = list1.stream();
		stream.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
