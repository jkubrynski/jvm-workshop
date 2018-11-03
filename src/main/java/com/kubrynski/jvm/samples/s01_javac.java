package com.kubrynski.jvm.samples;

class s01_javac {

	private static int SECA = 60*24;
	private static final int SECB = 60*24;

	private static final int A = 1;
	private static final int B = 2;

	void test() {
		final int fc = A + B;
		int c = A + B;

		if (true) {
			System.out.println("Test true");
		}
		if (3 == 3) {
			System.out.println("Test 3 == 3");
		}
		if (fc == 3) {
			System.out.println("Test fc == 3");
		}
		if (c == 3) {
			System.out.println("Test c == 3");
		}
	}

}
