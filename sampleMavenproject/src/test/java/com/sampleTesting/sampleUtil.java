package com.sampleTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleUtil {
	@BeforeSuite
	public void r() {
		System.out.println("after suite is exucuted");
		
	}
	@AfterSuite
public void g() {
	System.out.println("after suite is executed");
}

	
	
}
