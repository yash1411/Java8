package java8.examples;

import java.util.List;

public class TypeAnnotationsExample {
	
	@NonNull String str;  
	
	//Following are the examples of type annotations:
	@NonNull List<String>  
	List<@NonNull String> str  ;
	Arrays<@NonNegative Integer> sort  ;
	@Encrypted File file  
	@Open Connection connection  
	void divideInteger(int a, int b) throws @ZeroDivisor ArithmeticException
	
	

	public static void main(String[] args) {
	}
}
