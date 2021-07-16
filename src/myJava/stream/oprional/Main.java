package myJava.stream.oprional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		//stream.of()
		/*
		 * Optional<String> empty = Optional.of("Hello");//if we pass null here we'll get exception
		 * System.out.println(empty.isPresent()); System.out.println(empty.isEmpty());
		 * 
		 * String orElse = empty.orElse("Wrold"); System.out.println(orElse);
		 */
		
		//stream.ofNullable()
		/*
		 * Optional<String> empty = Optional.ofNullable("Hello");//null
		 * System.out.println(empty.isPresent()); System.out.println(empty.isEmpty());
		 * 
		 * String orElse = empty.orElse("Wrold"); System.out.println(orElse);
		 */
		
		//orElse()
		/*
		 * Optional<String> hello = Optional.ofNullable("Hello");//null
		 * System.out.println(hello.isPresent()); System.out.println(hello.isEmpty());
		 * 
		 * String orElse = hello .map(String::toUpperCase) .orElse("Wrold");
		 * 
		 * System.out.println(orElse);
		 */
		//orElseGet()
		/*
		 * Optional<String> hello = Optional.ofNullable("Hello");//null
		 * System.out.println(hello.isPresent()); System.out.println(hello.isEmpty());
		 * 
		 * String orElse = hello .map(String::toUpperCase) .orElseGet( () ->{ return
		 * "world"; });
		 * 
		 * System.out.println(orElse);
		 */
		//orElseThrow()
		/*
		 * Optional<String> hello = Optional.ofNullable("Hello");//null
		 * System.out.println(hello.isPresent()); System.out.println(hello.isEmpty());
		 * 
		 * String orElse = hello .map(String::toUpperCase)
		 * .orElseThrow(IllegalStateException :: new);
		 * 
		 * System.out.println(orElse);
		 */
		
		Optional<String> hello = Optional.ofNullable("Hello");//null
		System.out.println(hello.isPresent());
		System.out.println(hello.isEmpty());
		
		hello.map(String :: toUpperCase).ifPresentOrElse(word -> {
			System.out.println(word);
		}, () ->{
			System.out.println("World");
		});
	}
}
