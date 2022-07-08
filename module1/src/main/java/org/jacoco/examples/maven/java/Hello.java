package org.jacoco.examples.maven.java;

public class HelloWorld {

	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello again!";
		} else {
			return "Hello World!";
		}
	}

}
