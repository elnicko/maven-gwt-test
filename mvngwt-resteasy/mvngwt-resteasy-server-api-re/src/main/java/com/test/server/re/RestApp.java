package com.test.server.re;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.test.server.re.svc.EmployeeService;

public class RestApp  extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestApp() {
		singletons.add(new EmployeeService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}