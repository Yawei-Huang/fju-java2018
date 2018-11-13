package com.tom;

import java.util.Random;

public class SecretNumber {
	Random random = new Random();
	int secret = random.nextInt(10)+1;
	System.out.println(secret);
	public int secret(){
		this.secret = secret;
		return secret;
	}
	

}
