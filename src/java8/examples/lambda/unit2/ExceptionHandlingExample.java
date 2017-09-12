package java8.examples.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int [] someNumbers = { 1, 2, 3, 4 };
		int key = 0; // key = 0;  
		
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
		// 2. Let the lambda handle the exception - which will be very messy

	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			// 1. Don't know what type of exception I need to catch ?
			//try {
			System.out.println("Executing process");
				consumer.accept(i, key);
			//} catch(ArithmeticException | zzz | aaa e) {			}
			
		}
		
	}
	
	// 3 - Still the same complexity, but have moved to a separate area.
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		//return consumer;
		
		// OR
		
		//return (a, b) -> System.out.println(a + b);
		
		// OR
		
		return (v, k) ->  {
			try {
				System.out.println("Executing from wrapper");
				consumer.accept(v, k); // Extra layer - wrapper
			}
			catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
	

}
