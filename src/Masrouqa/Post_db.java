package Masrouqa;

public class Post_db {
	//Attributes&Setters&Getters
	public String Category;
	public String description;
	public int id;
	public Login obj;
	public int numpost;
	Post_db parameter;
	public void setPost(String Category,int photo,int id)
	{
		parameter.Category=Category;
		parameter.id=id;
	}
	public Post_db getPost()
	{
		return parameter;
	}

}
