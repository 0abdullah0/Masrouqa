package Masrouqa;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{
	static int exist;
	public static ArrayList <User_db>users=new ArrayList();
	public static ArrayList <Post_db>posts=new ArrayList();
	Scanner input=new Scanner(System.in);
	//Ezz & amr add your function here
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int choice,flag=0;
		while(true)
		{
		System.out.println("MASROUQA Application");
		System.out.println("-----------------------");
		System.out.println("enter the function:");
		System.out.println("1-Login 2-Sign up");
		choice=input.nextInt();
		switch(choice)
		{
		case 1:
		{
			//add your function here
			break;
		}
		case 2:
		{
			//add your function here
			break;
		}
		default:
			System.out.println("Invalid!!!");
		}
		flag=0;
		exist=0;
		}
	}
	}
