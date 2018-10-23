package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18(y/N)?");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		 
		System.out.println("*"+line+"*");
		boolean adult = line.toUpperCase().equals("Y");
		System.out.println(adult);
		if (adult){
			System.out.println("What is your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("What is your name?");
			String name = scanner.nextLine();
			System.out.println("What is your nick name?");
			String nickName = scanner.nextLine();
			System.out.println(age+"/"+name+"/"+nickName);
			
		}else{
			System.out.println("Goodbye!");
			
		}

	}

}
