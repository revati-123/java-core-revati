package com.revati.example;

public class Book 
{
	public int bookId;
	public String bookName;
	Author auther;
	
	Publication publicobj;
	
	
	public void AddBook(int bookId, String bookName, Author auther, Publication publicobj)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.auther = auther;
		this.publicobj = publicobj;
	}
	
	public String toString()
	{
		return String.format("%d20 %s %s %s", this.bookId, this.bookName, this.auther, this.publicobj);
	}
}
