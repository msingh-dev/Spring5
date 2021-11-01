package org.msingh.imp;

import org.msingh.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {

	public String specs() {

		return "hatchback from Suzuki";
	}

}
