package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */

		int max = 10000000;
		boolean isPrimeNumber = true;

		for (int i = 1; i < max; i++) {


			// check to see if the number is prime

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					isPrimeNumber = false;

					//break; // exit the inner for loop

				}
				else {

					System.out.println(i + " is a prime number");
					break;

				}

			}


		}
	}
}
