package com.sageit.sampleprograms;

public class CheckPrime {

	
	/* This method will let you know if the passed value is prime or not */
	
	public static boolean isPrime(int x) {

		for (int y = 2; y <= x; y++) {
			if (x % y == 0) {
				return false;
			}
		}

		return true;

	}

}
