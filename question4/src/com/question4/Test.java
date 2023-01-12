package com.question4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws AgeException {
		Candidate candidate = new Candidate();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter candidate name");
		
		candidate.setName(sc.next());
		
		System.out.println("Please enter candidate age");
		int age = sc.nextInt();
		try {
		if ( age < 21)
			throw new AgeException("Candidate is under age");
		else if ( age > 60)
			throw new AgeException("Candidate is over age");
		else 
			candidate.setAge(age);	
		} 
		catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Please enter candidate education");
			String edu = sc.next();
			if (!edu.equals("Btech"))
				throw new EduException("Sorry, invalid education");
			else 
				candidate.setEducation(edu);	
		}
		catch (EduException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(candidate.toString());
	}
}
