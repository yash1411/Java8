package java8.examples.defaultMethods;

@FunctionalInterface
public interface InterfaceTwo {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}