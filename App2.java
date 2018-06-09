public class App2 {

	public static void main(String args[]) {
		/*
		 * This is called method reference
		 * String::toLowerCase => str -> str.toLowerCase()
		 */
		System.out.println("Hello World!", String::toLowerCase);

		/*
		 * Example for method reference conversion
		 */
		(str, i) -> str.substring(i);
		String::substring
	}

	private static process(String str, Function<String, String> processor) {
		return processor.apply(str)
	}
}