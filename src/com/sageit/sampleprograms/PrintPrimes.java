package com.sageit.sampleprograms;

import com.sageit.sampleprograms.CheckPrime;

public class PrintPrimes {
		
	public String message = "We are learning static keyword";
	
	public static int number = 520;

	public void printPrimeNumbers(){
		for(int i = 3; i<=180; i++){
			boolean status = CheckPrime.isPrime(i);
			System.out.println(i+" is "+ status);
		}
	}
	
	public static void main(String args[]){
		
		PrintPrimes p1 = new PrintPrimes();
		PrintPrimes p2 = new PrintPrimes();
		PrintPrimes p3 = new PrintPrimes();
		
		p1.number = 621;
		p1.message = "I am trying to learn static variables";
		
		p1.printPrimeNumbers();
		
		System.out.println("The value of number : " + p2.number);
		System.out.println("The value of message : " + p2.message);
		
	}
	
	
}
