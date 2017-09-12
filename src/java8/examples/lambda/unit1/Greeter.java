package java8.examples.lambda.unit1;

public class Greeter {

	public void greet() {
		System.out.print("Hello world!");
	}
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		// 1. old way
		Greeter greeter = new Greeter();
		greeter.greet();
		

		// 2. Java 7 - passing the behavior
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		//3. Java 7 - using anonymous/inner class
		greeter.greet(new Greeting() {
			public void perform() {
				System.out.print("Hello world! anonymous/inner class");
			}
		});
		
		
		// Explanation - inline values - Lambda Expression
		/*
		aBlockOfCode = public void perform() {
			System.out.print("Hello world! - HelloWorldGreeting");
		}
		aBlockOfCode <assign to a variable>
		take out "public" - doesn't make any sense with a class context
		take out "perform" - method name is not required as it can be used by its variable name - aBlockOfCode
		take our "void" - return type, Java compiler knows what it returns based on the expression itself.
		
		Final Syntax (using ->)
		aBlockOfCode = () -> { System.out.print("Hello world! Lambda")); }
		OR
		aBlockOfCode = () -> System.out.print("Hello world! Lambda"));
		
		
		Now type of "aBlockOfCode" ? If Java has introduced a new type, eg. Function<K, V> - could not achieve Backward compatibility  
		so use FunctionalInterfacec => interface Greeting here in example
		*/
		
		// 4. send the behavior itself - Function as value
		MyLambda /*Greeting*/ lambdaGreeting = () -> System.out.print("Hello world! Lambda");
		greeter.greet(lambdaGreeting);
		// OR
		greeter.greet(() -> System.out.print("Hello world! Lambda"));
		
		MyAdd myAdd = (int a, int b) -> a + b;
		
	}

}

class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.print("Hello world! - HelloWorldGreeting");
	}
}

@FunctionalInterface
interface Greeting {
	public void perform();
}

@FunctionalInterface
interface MyLambda {
	public void perform();
}

@FunctionalInterface
interface MyAdd {
	public int add(int x, int y);
}




