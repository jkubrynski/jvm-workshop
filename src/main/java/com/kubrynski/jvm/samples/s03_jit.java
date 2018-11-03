package com.kubrynski.jvm.samples;

public class s03_jit {

	// Douglas Hawkins -> https://www.youtube.com/watch?v=6ICU2xo427M

	public static void main(String[] args) {
		Object trap = null;
		for (int i = 0; i < 300; i++) {
			long start = System.nanoTime();
			for (int j = 0; j < 5000; j++) {
				if (trap != null) {
					System.out.println("!!TRAP TRAP TRAP!!");
					trap = null;
				}
				new Object();
			}
			if (i == 200) {
				trap = new Object();
			}
			long end = System.nanoTime();
			System.out.format("i %3d => %6d ns\n", i, end - start);
		}
	}

	// -Xlog:jit*=debug
}
