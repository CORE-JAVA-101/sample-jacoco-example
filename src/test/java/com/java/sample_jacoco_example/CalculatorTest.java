package com.java.sample_jacoco_example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

	Calculator cal;

	@Before
	public void before() {
		cal = new Calculator();
	}

	@Test
	public void sumTest() {
		assertEquals(6, cal.sum(3, 2));
	}

	// @Test // uncommen this @Test line to make jacoco 100%.
	// jacoco has an html file:
	// file:///D:/workspace/programs/workbench/rabindra/sample-jacoco-example/target/site/jacoco/index.html
	public void diffTest() {
		assertEquals(1, cal.diff(3, 2));
	}

}
