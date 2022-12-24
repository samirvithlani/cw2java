package collection.stream;

import java.util.stream.Stream;

public class StreamDemo1 {

	// creation of stream integr..
	// Stream interface...
	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(new Integer[] { 10, 20, 30, 40, 50, 60 });
		stream.forEach(x->System.out.println(x));
	}
}
