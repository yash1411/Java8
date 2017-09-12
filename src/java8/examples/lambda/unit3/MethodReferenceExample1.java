package java8.examples.lambda.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		// 1.
		Thread t1 = new Thread(() -> printMessage()); // This Lambda is just executing a method - as no input argument, and no parameters, or obvious parameter
		t1.start();
				
		// 2. Change the above with Method reference. Object::method, ClassName::method
		Thread t2 = new Thread(MethodReferenceExample1::printMessage);  // () -> method()
		// MethodReferenceExample1::printMessage === () -> printMessage()
		t2.start();
		
	}
	
	
	public static void printMessage() {
		System.out.println("Hello");
	}
	

}
