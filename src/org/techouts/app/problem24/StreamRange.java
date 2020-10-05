package org.techouts.app.problem24;

import java.util.stream.Stream;

public class StreamRange {

	public static void main(String[] args) { 
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    .filter(i -> i < 3 || i >7)
	    .forEach(i -> System.out.print(i + " "));

	}
}
