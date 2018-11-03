package com.kubrynski.jvm.benchmarks;

import java.util.Random;

public class Caller {

	private final Random random = new Random();

	public double callMe() {
		return Math.log(random.nextDouble());
	}

}
