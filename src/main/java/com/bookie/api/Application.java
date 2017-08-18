package com.bookie.api;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.ApplicationPath;

import com.bookie.api.hello.GreetingController;

@ApplicationPath("/rest/api")
public class Application extends javax.ws.rs.core.Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<>();
		classes.add(GreetingController.class);
		return classes;
	}
	
}
