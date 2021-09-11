package com.bl.addressmain;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Scanner;


//ControllerLayer
public class ContactsMain {
	private static List<Persons> AddressDiary = new ArrayList();

	public static List<Persons> getAddressDiary() {
		return AddressDiary;
	}

	public void setAddressDiary(List<Persons> addressDiary) {
		AddressDiary = addressDiary;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add contact");
		System.out.println("2. Edit contact");
		System.out.println("3. Delete contact");
		System.out.println("4. Display contact");
		
		while(true) {
			System.out.println("Enter the choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice==1) {
				System.out.println("Enter First name: ");
				String FirstName = sc.nextLine();
				System.out.println("Enter last name: ");
				String LastName = sc.nextLine();
				System.out.println("Enter Address: ");
				String Address = sc.nextLine();
				System.out.println("Enter City: ");
				String City = sc.nextLine();
				System.out.println("Enter State: ");
				String State = sc.nextLine();
				System.out.println("Enter Zipcode: ");
				String ZipCode = sc.nextLine();
				System.out.println("Enter phone no: ");
				String PhoneNo = sc.nextLine();
				System.out.println("Enter email: ");
				String Email = sc.nextLine();
				
				Persons person = new Persons(FirstName,LastName,Address,City,State,ZipCode,PhoneNo,Email);
				AddressDiary.add(person);
				
				System.out.println("Person added Successfully ");
			}
			else if (choice==2) {
			        System.out.println ( "Enter Name To Edit from Contact list: " );
			        String firstNam = sc.next ();
			        for (Persons value : AddressDiary) {
			            if ( Objects.equals( firstNam, value.FirstName )) {
			                System.out.print ( "Enter First Name: " );
			                String firstName = sc.next();
			                value.setFirstName ( firstName);
			                System.out.print ( "Enter Last Name: " );
			                String lastName = sc.next();
			                value.setLastName ( lastName );
			                System.out.print ( "Enter Address: " );
			                String address = sc.next();
			                value.setAddress ( address );
			                System.out.print ( "Enter City: " );
			                String city = sc.next();
			                value.setCity ( city );
			                System.out.print ( "Enter State: " );
			                String state = sc.next();
			                value.setState ( state );
			                System.out.print ( "Enter ZipCode: " );
			                String ZipCode = sc.next();
			                value.setZipCode( ZipCode);
			                System.out.print ( "Enter Phone Number: " );
			                String PhoneNo = sc.next();
			                value.setPhoneNo( PhoneNo );
			                System.out.print ( "Enter Email id: " );
			                String email = sc.next ();
			                value.setEmail( email );
			            	}
			        }
			}else if (choice==3) {
				System.out.println("Enter the index at which person contact to be removed:");
				int index = Integer.parseInt(sc.nextLine());
				AddressDiary.remove(index);
			}else if (choice==4) {
				getAddressDiary();
				System.out.println(getAddressDiary());
			}else{
				System.out.println("Invalid choice");
			}
		}
	}
}
