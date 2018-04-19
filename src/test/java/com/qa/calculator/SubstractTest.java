package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SubstractTest {
	private Substractor substractor;

	@Test
	public void test() {
		substractor = new Substractor();
		int expectedValue=2;
		int ActualValue= substractor.substract(4,2);
		Assert.assertEquals(expectedValue, ActualValue);
	}

}
