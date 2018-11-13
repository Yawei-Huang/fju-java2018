package com.tom;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter number of tickets");
		Scanner scanner = new Scanner(System.in);
		int numOfTicket = scanner.nextInt();
		System.out.println("How mant rounf-trip tickets");
		int rtrip = scanner.nextInt();
		System.out.println("Total tickets" + numOfTicket);
		System.out.println("Round-trip" + rtrip);
		int total = (numOfTicket-rtrip)*ticket.getPrice()+ (int)(price * 2 * 0.9f);
		System.out.println("Total" + total);
		
	}

}
