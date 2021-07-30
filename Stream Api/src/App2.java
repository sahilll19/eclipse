import java.util.List;
import java.util.stream.Collectors;

public class App2 {
	String string1;
	String string2;

	public App2(String string1, String string2) {
		super();
		this.string1 = string1;
		this.string2 = string2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using filter
		List<String> names = List.of("Sahil", "Saurav", "Sugantha", "Ramesh");
		List<String> newNames = names.stream().filter(e-> e.startsWith("S")).collect(Collectors.toList());
		System.out.println(newNames);
		
		//using map
		List<Integer> numbers = List.of(2,8,65,98,7);
		List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//using method reference
		newNumbers.stream().forEach(System.out::println);
		
		//sorted list
		System.out.println("sorted");
		numbers.stream().sorted().forEach(System.out::println);
	}

}
