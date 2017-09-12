package java8.examples.lambda.unit1;

import java8.examples.defaultMethods.InterfaceOne;

public class LambdaExample {

	public static void main(String[] args) {

		// Old way - using anonymous class implementation
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable");
			}
		};

		// Using Lambda
		Runnable runnable2 = () -> {
			System.out.println("My Runnable with Lambda");
		};

		new Thread(runnable, "anonymous").start();
		new Thread(runnable2, "lambda").start();
		new Thread(() -> {
			System.out.println("My Runnable with Lambda");
		}, "lambda").start();

		// Some more example - step by step
		InterfaceOne one = (s) -> System.out.println(s);
		one.method1("abc");
	}

}
