package Masrouqa;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{
	static int exist;
	public static ArrayList <User_db>users=new ArrayList();
	public static ArrayList <Post_db>posts=new ArrayList();
	Scanner input=new Scanner(System.in);
	public Post_db Post(User_db uobj)
    {
        System.out.println("Post Form");
        System.out.println("------------------------");
        Post_db obj=new Post_db();
        System.out.println("enter the Category:");
        obj.Category=input.next();
        obj.id=posts.size()+1;
        obj.numpost=uobj.PhoneNumber;
        System.out.println("enter the description:");
        obj.description=input.next();
        return obj;
    }
        public void Search()
	{
		System.out.println("Search Form");
		System.out.println("----------------------");
		Search obj=new Search();
		String category;
		System.out.println("enter the Category:");
		category=input.next();
		obj.setCategory(category);
		obj.DisplayItem(posts);
	}
        public  User_db Signup()
    	{
    		User_db obj=new User_db();
    		System.out.println("Enter phone number");
    		obj.PhoneNumber=input.nextInt();
    		System.out.println("Enter password");
    		obj.Password=input.nextInt();
    		System.out.println("Enter e-mail");
    		obj.email=input.next();
    		System.out.println("Enter address");
    		obj.address=input.next();
    		return obj;
    	}
        public User_db Login()
    	{
    		System.out.println("Login FORM");
    		System.out.println("----------------------------");
    		Login log=new Login();
    		User_db obj=new User_db();
    		obj=log.EnterPhoneNumber();
    		for(int i=0;i<users.size();i++)
    		{
    		if((users.get(i).Password!=obj.Password||users.get(i).PhoneNumber!=obj.PhoneNumber)&&(i+1==users.size()))
    		{
    		exist=log.VerifyForException();	
    		}
    		if((users.get(i).Password==obj.Password||users.get(i).PhoneNumber==obj.PhoneNumber))
    		{
    			break;
    		}
    		}
    		return obj;
    	}
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
		if(users.size()==0)
		{System.out.println("Not Signed up Yet");break;}
		Main form = new Main();
		User_db uobj=new User_db();
		uobj=form.Login();
		if(exist==1)
			break;
		while(true)
		{
			int ch;
			System.out.println("enter the function:");
			System.out.println("1-Search 2-Post 3-Log out");
			ch=input.nextInt();
			switch(ch)
			{
			case 1:
			{
			form.Search();break;
			}
			case 2:
			{
				Post_db obj=new Post_db();
				obj=form.Post(uobj);
				posts.add(obj);break;
			}
			case 3:
			{
				flag=1;break;
			}
			default:
				System.out.println("Invalid!!!");break;
				
			}
			if(flag==1)
				break;
		}
		if(flag==1)
			break;
		}
		case 2:
		{
			User_db obj=new User_db();
			Main form = new Main();
			obj=form.Signup();
			users.add(obj);break;
		}
		default:
			System.out.println("Invalid!!!");
		}
		flag=0;
		exist=0;
		}
	}
	}
