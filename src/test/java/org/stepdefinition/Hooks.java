package org.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before(order=3)
	public void beforemethod1() {
		System.out.println("beforemethod1");

	}
	@After(order=3)
	public void afterMethod1() {
		System.out.println("afterMethod1");

	}
	@Before(order=2)
	public void beforemethod2() {
		System.out.println("beforemethod2");

	}
	@After(order=2)
	public void afterMethod2() {
		System.out.println("afterMethod2");

	}
	@Before(order=3)
	public void beforemethod3() {
		System.out.println("beforemethod3");

	}
	@After(order=3)
	public void afterMethod3() {
		System.out.println("afterMethod3");

	}

}
