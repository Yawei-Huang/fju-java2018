package com.tom;

public class Student {

	String name;
	int english;
	int math;
	
	public Student() {
		
	}
	
	public Student(String name, int english, int math) { 
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public void print() {
	System.out.print(name + "\t" + english + "\t" + math + "\t" 
						+ getAverage() + "\t");

	
		if(getAverage() < 60){
			System.out.print("Failed");
		}
			else{
				System.out.print("Pass");
			
			}
		public char getGrading() {
			char grading = 'F';
			int average = getAverage();
			switch(average/10){
			case 
			
		}
	}
	public int getAverage(){
		return (english+math)/2;
		
	}
	
}