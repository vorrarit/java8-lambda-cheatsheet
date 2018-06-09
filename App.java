interface Processor {
	String process(String str);
}

public class App {
	public static void main(String[] args) {
		System.out.println(process("Hello World!"), new Processor() {
			public String process(String str) {
				/* we want to pass only toLowerCase method but we need to
				 * solve by creating interface and pass an entire object.
				 * this really in efficient
				 */
				return str.toLowerCase(); 
			}
		}));

		/* in java 8 lambda, we can do like this */
		/* interface with single method is called functional interface in java8 */
		/* and we can use lambda as replacement */
		System.out.println(process("Hello World!", (String str) - {
			return str.toLowerCase();
		}))

		/* we can compress it into the following */
		System.out.println(process("Hello World!", (str) -> {
			return str.toLowerCase();
		}))

		/* or even more compress like this */
		System.out.println(process("Hello World!", str -> str.toLowerCase()));

	}

	private static String process(String str, Processor processor) {
		return processor.process(str)
	}
}

/* or we can declare method to accept function as parameter.
 * in this case, it's function that receive String as input and String as output
 */
public class App2 {
	public static void main(String[] args) {

		System.out.println(process("Hello World!", str -> str.toLowerCase()));

	}

	private static String process(String str, Function<String, String> processor) {
		return processor.apply(str)
	}
}