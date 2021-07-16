package myJava.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examp2 {

	public static void main(String[] args) {
		
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			
			//find first
			Arrays.asList("a1", "a2", "a3")
		    .stream()
		    .findFirst()
		    .ifPresent(System.out::println); 
			
			//find first
			Stream.of("a1", "a2", "a3")
		    .findFirst()
		    .ifPresent(System.out::println);
			//range
			IntStream.range(1, 4)
		    .forEach(System.out::println);
			//average
			Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .average()
		    .ifPresent(System.out::println);
			//substring
			Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .average()
		    .ifPresent(System.out::println);
			
			//map to object
			IntStream.range(1, 4)
		    .mapToObj(i -> "a" + i)
		    .forEach(System.out::println);
			
			Stream.of(1.0, 2.0, 3.0)
		    .mapToInt(Double::intValue)
		    .mapToObj(i -> "a" + i)
		    .forEach(System.out::println);

	}
}
