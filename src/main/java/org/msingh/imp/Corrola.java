package org.msingh.imp;

import org.msingh.interfaces.Car;
import org.msingh.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("corrola")
public class Corrola implements Car{
	
	//Manually creating the Engine object. this is partial Dependency Injection. This approach is not good, in terms of using Spring.
	//If Spring is used, use @Autowired annotation to create the object by Spring.
	
	//@Autowired(required = false)  -- create the object if required otherwise wont create the object
	// In this we are using the default constructor of Engine class
	//Spring is creating the object here and we can use this later in the code.
	@Autowired
	@Qualifier("V6Engine")
	Engine engine  ;
	
	/*
	 * 
	//@Autowired 
	//this is a setter, to use this setter method, we have use the @Autowired annotation explicitly, otherwise it will not work. it will initialize constructor value
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
	
	
	//@Autowired
	//this is constructor, so it will work if we use @Autowired annotation above this constructor or on the Engine property on line 13.
	public Corrola(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
	
	*/

	public String specs() {
		String specs = "Corolla " + engine.type();
		return specs;
	}
	
	

}
