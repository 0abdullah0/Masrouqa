package Masrouqa;

import java.util.Scanner;

public class Login {
	//Bounadry
	int PhoneNumber;
	int Password;
	Scanner input=new Scanner(System.in);
	public User_db EnterPhoneNumber()
	{
		User_db obj=new User_db();
		System.out.println("Enter phone number:");
		obj.PhoneNumber=input.nextInt();
		System.out.println("Enter password:");
		obj.Password=input.nextInt();
		return obj;
	}
	public int VerifyForException()
	{
		System.out.println("Not Existing!");
		return 1;
	}
}
