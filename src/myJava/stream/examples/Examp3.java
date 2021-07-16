package myJava.stream.examples;

import java.util.stream.Stream;

public class Examp3 {

	public static void main(String[] args) {
	
		/*
		 * Stream.of("d2", "a2", "b1", "b3", "c") .filter(s -> {
		 * System.out.println("filter: " + s); return true; }) .forEach(s ->
		 * System.out.println("forEach: " + s));
		 * 
		 * }
		 */
	
	Stream.of("d2", "a2", "b1", "b3", "c")
    .map(ss -> {
        System.out.println("map: " + ss);
        return ss.toUpperCase();
    })
    .anyMatch(ss -> {
        System.out.println("anyMatch: " + ss);
        return ss.startsWith("A");
    });
}
}
