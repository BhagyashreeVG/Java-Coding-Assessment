package com.question2;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Book[] books = new Book[4];
		
		Author author1 = new Author("J. K. Rowling", 50, "Female");
		Author author2 = new Author("Robin Sahrma", 55, "Male");
		Author author3 = new Author("Ruskin Bond", 70, "Male");
		
		books[0] = new Book();
		books[0].setBookNumber(101);
		books[0].setName("The monk who sold his Ferarri");
		books[0].setCost(120.0);
		books[0].setPages(300);
		books[0].setAuthor(author2);
		
		books[1] = new Book();
		books[1].setBookNumber(102);
		books[1].setName("Harry potter and chamber of secrets");
		books[1].setCost(500.0);
		books[1].setPages(500);
		books[1].setAuthor(author1);
		
		books[2] = new Book();
		books[2].setBookNumber(103);
		books[2].setName("The blue umbrella");
		books[2].setCost(220.0);
		books[2].setPages(350);
		books[2].setAuthor(author3);
		
		books[3] = new Book();
		books[3].setBookNumber(104);
		books[3].setName("Harry potter and goblet of fire");
		books[3].setCost(600.0);
		books[3].setPages(500);
		books[3].setAuthor(author1);
		
		System.out.println("----Library-----");
		System.out.println("0)The monk who sold his Ferarri");
		System.out.println("1)Harry potter and chamber of secrets");
		System.out.println("2)The blue umbrella");
		System.out.println("3)Harry potter and goblet of fire");
		System.out.println("Please enter number to get details of book");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		System.out.println(books[index].toString());
	}

}
