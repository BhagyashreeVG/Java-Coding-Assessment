package com.question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		ResultSet myRs = null;
		int rowsInserted = 0;
		int selection = 0;
		PreparedStatement pstmt = null;
		Scanner scanner = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "DataGuard432$");
			System.out.println("Database connection successful!\n");
			while (selection != 3) {
				System.out.println("[");
				System.out.println("\t1. Get All Guest Details");
				System.out.println("\t2. Get All Guests By Name");
				System.out.println("\t3. Exit");
				System.out.println("]");
				System.out.println("select a number between 1 - 3:");
					
				scanner = new Scanner(System.in);
				selection = Integer.parseInt(scanner.next());
					
				
				if(selection == 1 ) {
					List<Guest> guestList = new ArrayList<Guest>();
					pstmt = myConn.prepareStatement("select * from guest;");
					myRs = pstmt.executeQuery();
					while(myRs.next()) {
						Guest guest = new Guest();
						guest.setGuestId(myRs.getInt(1));
						guest.setName(myRs.getString(2));
						guest.setCity(myRs.getString(3));	
						guestList.add(guest);
					}
					System.out.println("Guest Data:");
					System.out.println("----------------");
					System.out.println("ID\tFirstName\tCity");
					System.out.println("----------------");
						
					ListIterator<Guest> itr = guestList.listIterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
				
				if(selection == 2) {
					System.out.println("Search Employee By Firstname:");
					pstmt = myConn.prepareStatement("SELECT firstName FROM Guest ;");
					
					myRs = pstmt.executeQuery();
					while(myRs.next()) {
					Guest guest = new Guest();
					
					guest.setName(myRs.getString(1));
					System.out.println(guest.getName());				 
				}
				
			}
		}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}

	}

}
