package org.techouts.app.problem23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CalculateUsingStreamAPI {

	final static List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	public static void main(String[] args) {
		primes.stream()
		.max((i1, i2) -> Integer.compare(i1, i2)) 
		.ifPresent(max -> System.out.println("Maximum value " + max));

		primes.stream() 
		.max(Comparator.comparing(i -> -i)) 
		.ifPresent(min -> System.out.println("Minimum value " + min));

		primes.stream() 
		.mapToInt(i -> i) 
		.average() 
		.ifPresent(avg -> System.out.println("Average value " + avg));

		int sum1 = primes.stream() 
				.mapToInt(i -> i) 
				.sum(); 
		System.out.println("Sum value " + sum1);

		long count = primes.stream().count();
		System.out.println("Count value "+count);

	}
}
