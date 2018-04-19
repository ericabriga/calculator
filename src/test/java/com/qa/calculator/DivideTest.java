package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {
	private Divider divider;

	@Test
	public void test() {
		divider = new Divider();
		int expectedValue=2;
		int ActualValue= divider.divide(6,3);
		Assert.assertEquals(expectedValue, ActualValue);
	}

}
