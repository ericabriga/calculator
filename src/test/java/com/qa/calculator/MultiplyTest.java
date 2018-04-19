package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {
	private Multiplier multiplier;

	@Test
	public void test() {
		multiplier = new Multiplier();
		int expectedValue = 4;
		int actualValue=multiplier.multiply(2,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
