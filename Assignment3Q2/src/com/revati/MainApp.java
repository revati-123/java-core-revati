package com.revati;

import com.revati.example.Book;
import com.revati.example.Author;
import com.revati.example.Publication;

public class MainApp
{

	public static void main(String[] args) 
	{
		Author a1 =new Author();
		a1.createNewAuther(101,"snehal");
		
		Author a2 =new Author();
		a2.createNewAuther(102,"Anish");
		
		Author a3 =new Author();
		a3.createNewAuther(103,"Amish");
		
		Publication p1 =new Publication();
		p1.createnewPublication(17051, "navbharati");

		Publication p2 =new Publication();
		p2.createnewPublication(17052, "suraj");
		
		Book []data= new Book[4];
		
		data[0]= new Book();
		data[0].AddBook(1, "Ravan", a1, p1);
		
		data[1]= new Book();
		data[1].AddBook(2, "Sati", a2, p2);
		
		data[2]= new Book();
		data[2].AddBook(3, "Ram", a3, p1);
		
		data[3]= new Book();
		data[3].AddBook(4, "Krishna", a1, p2);
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		SearchBookbyAuther(data, "amish");
		sortBookbyName(data);
	}
	
	public static void SearchBookbyAuther(Book []records, String Auther_Name)
	{
		
	}
	
	public static void sortBookbyName(Book []rec)
	{
		for(int j=0;j<rec.length;j++)
		{
			System.out.println("something");
		}
	}
}
