package com.revati.example;

public class Author 
{
	public int authorId;
	public String authorName;
	
	public void createNewAuther(int authorId, String authorName)
	{
		this.authorId = authorId;
		this.authorName =authorName;
	}
	
	public String toString()
	{
		return String.format("%d20 %s",this.authorId, this.authorName);
	}
}
