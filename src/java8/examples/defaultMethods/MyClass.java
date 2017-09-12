package java8.examples.defaultMethods;

public class MyClass implements InterfaceOne, InterfaceTwo {

		@Override
		public void method2() {
		}

		@Override
		public void method1(String str) {
		}

		//MyClass won't compile without having it's own log() implementation
		@Override
		public void log(String str){
			System.out.println("MyClass logging::"+str);
			InterfaceOne.print("abc");
		}
				
	}
