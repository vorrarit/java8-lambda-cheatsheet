import java.util.function.BiFunction;
import java.util.function.Function;

import java.util.function.Function;

public class App2 {

	public static void main(String args[]) {
		/*
		 * This is called method reference
		 * String::toLowerCase => str -> str.toLowerCase()
		 */
		System.out.println(process("Hello World!", String::toLowerCase));

		/*
		 * Example for method reference conversion
		 */
		System.out.println(process2("abcdefg", 3, String::substring));
	}

	private static String process(String str, Function<String, String> processor) {
		return processor.apply(str);
	}

	private static String process2(String str, int i, BiFunction<String, Integer, String> processor) {
		return processor.apply(str, i);
	}
}