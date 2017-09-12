package java8.examples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html
public class TypeInferenceExample {

	public static void showList(List<Integer> list) {
		if (!list.isEmpty()) {
			list.forEach(System.out::println);
		} else
			System.out.println("list is empty");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// An old approach(prior to Java 7) to create a list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);

		// Java 7
		List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
		list2.add(12);
		showList(list2);

		// Java 8
		showList(new ArrayList<>());
		
		///////////////////
		
		//1. Type Inference and Instantiation of Generic Classes
		Map<String, List<String>> myMap1 = new HashMap<String, List<String>>();
		Map<String, List<String>> myMap2 = new HashMap<>();
		Map<String, List<String>> myMap3 = new HashMap(); // unchecked conversion warning
		
				
		//2. Target Types
		// static <T> List<T> emptyList();
		
		// This works in both Java SE 7 and 8
		List<String> listOne = Collections.emptyList();
		
		// OR you could use a type witness and specify the value of T as follows:
		List<String> listTwo = Collections.<String>emptyList();
		

	}

	// 3. Type Inference and Generic Constructors of Generic and Non-Generic Classes
	class MyClass<X> {
		<T> MyClass(T t) {
			// ...
		}
	}
	// new MyClass<Integer>("")
	// MyClass<Integer> myObject = new MyClass<>("");

	
	//Other Examples
	static <T> T pick(T a1, T a2) { return a2; }
	Serializable s = pick("d", new ArrayList<String>());
}
