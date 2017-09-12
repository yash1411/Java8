package java8.examples.lambda.unit2;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		/*final */int b = 20; // 3.2 This will be considered "effectively final" - unless you change it, Java would consider it, otherwise will give compile time error.
		
		// 1. using anonymous class
		doProcess(a, new Process() {
			public void process(int i) {
				//b = 100; // 3.1 this doesn't work though, but would give error, if I try to change.
				
				System.out.println("Diff : " + (i - b)); // b is accessible inside here
			}
		});
		
		// 2. using lambda
		doProcess(a, i -> System.out.println(i + b));

	}
	
	public static void doProcess(int i, Process p) {
		p.process(i); // being called here, but still will be able to access b
	}
}

interface Process {
	void process(int i);
}
