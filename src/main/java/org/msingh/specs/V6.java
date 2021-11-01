package org.msingh.specs;

import org.msingh.interfaces.Engine;
import org.springframework.stereotype.Component;


@Component("V6Engine")
public class V6 implements Engine {

	public String type() {
		// TODO Auto-generated method stub
		return "V6 Engine";
	}

}
