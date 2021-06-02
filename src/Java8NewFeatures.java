import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8NewFeatures {

	public static void main(String[] args) {

		//filterAndCollect();
		
		//flatMapExample();
		
		Stream.iterate(40, n -> n + 2).limit(21).forEach(System.out::println);
		
	}

	static void filterExample() {

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);

		listOfNumbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

	}

	static void filterAndCollect() {

		List<Integer> list = Arrays.asList(10, 13, 5, 15, 12, 20, 11, 25, 16);

		int totalMatch = list.stream().filter(i -> i % 3 == 0).collect(Collectors.counting()).intValue();

		System.out.println(totalMatch);
	}

	static void filterAndReduce() {

		List<Integer> list = Arrays.asList(10, 13, 5, 15, 12, 20, 11, 25, 16);

		int sum = list.stream().filter(i -> i % 3 == 0).reduce((a, b) -> a + b).get();

		System.out.println(sum);
	}

	static void filterAndAllMatch() {

		List<Integer> list = Arrays.asList(10,13,5,15,12,20,11,25,16);

		boolean isItemFound = list.stream().filter(i -> i % 2 == 0).allMatch(i -> i >= 10);

		System.out.println("Flag =" + isItemFound);
	}

	static void filterAndAnyMatch() {
		List<Integer> list = Arrays.asList(10,13,5,15,12,20,11,25,16,50);

		boolean anyMatch = list.stream().filter(i -> i % 2 == 0).anyMatch(i -> i > 20);

		System.out.println("Flag One = " + anyMatch);
	}

	static void filterWithMax() {
		List<Integer> list = Arrays.asList(0, 13, 5, 15, 12, 20, 11, 25, 16);

		Comparator<Integer> c = (o1, o2) -> o1.compareTo(o2);

		Optional<Integer> value = list.stream().filter(i -> i % 5 == 0).max(c);

		System.out.println("Value = " + value);

	}
	
	static void fileterAndFindAny() {
		
		List<Integer> list = Arrays.asList(10,13,5,15,12,20,11,25,16);
		
		boolean itemFound = list.stream().filter(i-> i%4==0).findAny().isPresent();
		
		System.out.println("Item Found =" + itemFound);
	}
	
	static List<String> mapFunction() {
		
		 List<String> list = Arrays.asList("London","HongKong","Paris","NewYork");
		 
		 return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	
	static void mapIntegrMultiply() {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		list = list.stream().map(i -> i*i).collect(Collectors.toList());
		
		System.out.println("List = " +list );
	}
	
	static void flatMapExample() {
		
		List<Integer> even = Arrays.asList(2,4,6);
		
		List<Integer> odd = Arrays.asList(1,3,5);
		
		List<Integer> primes = Arrays.asList(2,3,5,7,11);
		
		Stream<List<Integer>> fullStream = Stream.of(even,odd,primes);  // after this it will be list of list  [[2,4,6] , [1,3,5] ,[2,3,5,7,11]]
				
		System.out.println("Flat Map = " + fullStream.flatMap(list -> list.stream()).collect(Collectors.toList())); 
	}
}

