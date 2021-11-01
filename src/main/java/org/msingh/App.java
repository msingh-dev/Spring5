package org.msingh;

import org.msingh.imp.Corrola;
import org.msingh.imp.Swift;
import org.msingh.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

//		Car swift = new Swift();
//		Car corolla = new Corrola();

	//	String swiftString = swift.specs();

		//System.out.println(swiftString);

		//Car mycar = new Swift();

		//System.out.println(mycar.specs());

		//Component Based programming --> Power of Spring
		//Spring Controls the object creation process --> Inversion of Control

		//Bean Factory is the place where Spring keeps all the objects it creates.

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// this is called dependency injection as we are injecting the object to the class object.
		//This is done without using new keyword.
		
		Car myCar = context.getBean("corrola",Car.class); 
 
		System.out.println(myCar.specs());
		context.close();

	}

}
