package java8.examples;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RepeatingAnnotationsExample {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Cars {
		Manufacturer[] value() default {};
	}
	
	@Repeatable(value = Cars.class) // JAVA8 annotation for repeatable types 
	public @interface Manufacturer {
		String value();

	};

	@Manufacturer("Mercedes Benz")
	@Manufacturer("Toyota")
	@Manufacturer("BMW")
	@Manufacturer("Range Rover")
	public interface Car {

	}
	
	/* Prior to Java8, to have a repeated annotation, will have to group them in a container annotation
	@Manufactures({
	@Manufacturer(name =”BMW”),
	@Manufacturer(name = “Range Rover”)
	})
	public class Car{
	//code goes in here
	}
	*/

	public static void main(String[] args) {

		Manufacturer[] a = Car.class.getAnnotationsByType(Manufacturer.class);
		System.out.println("Number of car manufacturers is " + a.length);

		/*
		 * Retrieving Annotation There are two ways of accessing them. 
		 * 
		 * Accessing them
		 * via their container annotation using getDeclaredAnnotation() or
		 * getAnnotation().In the code above, we used this to print out the car
		 * manufactures 
		 * 
		 * Accessing them 
		 * via the getAnnotationsByType() or getDeclaredAnnotationsByType() 
		 * which are new methods in the Reflection API. We also used this method 
		 * to print out the number of manufacturers in the code above.
		 */

		System.out.println("\n-------Printing out Car Manufacturers--------");
		Cars cars = Car.class.getAnnotation(Cars.class);
		for (Manufacturer car : cars.value()) {
			System.out.println(car.value());
		}

	}
}
