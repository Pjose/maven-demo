package com.pj.learn.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import com.pj.learn.Calculator;

public class squareTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		double output = calc.square(8);
		assertEquals(64, output, 0.0);
	}

}
