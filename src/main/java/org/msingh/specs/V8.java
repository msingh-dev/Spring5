package org.msingh.specs;

import org.msingh.interfaces.Engine;
import org.springframework.stereotype.Component;


@Component("V8Engine")
public class V8 implements Engine {

	public String type() {
		// TODO Auto-generated method stub
		return "V8 Engine";
	}

}
