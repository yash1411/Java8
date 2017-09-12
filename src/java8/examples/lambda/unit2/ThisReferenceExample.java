package java8.examples.lambda.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, NewProcess p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this); 
		});
	}
	
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		//1.
		thisReferenceExample.doProcess(10, new NewProcess() {
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this); // This will give 
			}
			
			@Override
			public String toString() {
				return "This is the main anonymous class instance";
			}
		});
		
		//2. But with Type Inference - this wont work. 'this' is not associated/modified with the Lambda intentionally
		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			//System.out.println(this); // This will not work
		});
		
		//3. Using Instance method
		thisReferenceExample.execute();
		
	}
	
	@Override
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}
	
}

interface NewProcess {
	void process(int i);
}



