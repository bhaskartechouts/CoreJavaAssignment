package org.techouts.app.problem25;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDouble {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		DoubleStream stream1 = stream.mapToDouble(num -> (double)num);
		stream1.forEach(System.out::println);
	}
}
