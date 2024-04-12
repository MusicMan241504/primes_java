package primes_java;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
//		long startTime = System.nanoTime();
//
//		/* LinkedList<Integer> primes =  */linkedListPrimes(20000);
//		//int[] primes = arrayPrimes(20000);
//
//		long endTime = System.nanoTime();
//		long time = endTime-startTime;
//		System.out.println(time/1000000.0 + " ms");
//




		long startTime = System.nanoTime();

		/*int[] primes = */arrayPrimes(1000000);

		long endTime = System.nanoTime();
		long time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");


//		for (int prime: primes) {
//			System.out.println(prime);
//		}

	}

	public static LinkedList<Integer> linkedListPrimes(int max) {
		boolean isPrime = true;
		LinkedList<Integer> primes = new LinkedList<>();
		int num = 2;
		int i = 0;
		while (i<max) {
			isPrime = true;
			for (int prime : primes) {
				if (num%prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(num);
				i++;

			}
			num++;
		}
		return primes;

	}



	public static int[] arrayPrimes(int max) {
		boolean isPrime = true;
		int[] primes = new int[max];
		int num = 2;
		int i = 0;
		primes[0] = 2;
		while (i<max) {
			isPrime = true;
			for (int j=0; primes[j]<=num/primes[j]; j++) {
				if (num%primes[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				//System.out.println(num);
				primes[i] = num;
				i++;

			}
			num++;
		}
		return primes;

	}

}
