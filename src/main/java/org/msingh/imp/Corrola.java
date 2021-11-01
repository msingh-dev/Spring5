package org.msingh.imp;

import org.msingh.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corrola")
public class Corrola implements Car{

	public String specs() {
		// TODO Auto-generated method stub
		return "Corolla";
	}

}
