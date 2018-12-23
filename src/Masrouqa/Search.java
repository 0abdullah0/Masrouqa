package Masrouqa;

import java.util.ArrayList;

public class Search {
	//Bounadry
	String Category;
	public void DisplayItem(ArrayList<Post_db>posts)
	{
		System.out.println("RESULTS:");
		System.out.println("------------------");
		for(int i=0;i<posts.size();i++)
		{
			if(Category.equals(posts.get(i).Category))
			{
				System.out.println("Post's ID:"+posts.get(i).id);
				System.out.println("Post's Descibtion:"+posts.get(i).description);
				System.out.println("Post's Category:"+posts.get(i).Category);
				System.out.println("Post's Owner:"+posts.get(i).numpost);
				System.out.println("#####################");
			}
			
		}
	}
	public void setCategory(String Category)
	{
		this.Category=Category;
	}
	}
