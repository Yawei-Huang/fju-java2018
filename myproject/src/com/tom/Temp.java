package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		System.out.println("Please enter temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		double f = c*(9/5)+ 32;
		System.out.printf("%.1 C = %.1F" , c, temp.fahrenheit());

	}

}
