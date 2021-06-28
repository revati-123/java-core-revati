package com.revati.example;

public class Publication 
{
	public int publicationId;
	public String publicationName;
	
	public void createnewPublication(int publicationId, String publicationName)
	{
		this.publicationId = publicationId;
		this.publicationName = publicationName;
	}
	
	public String toString()
	{
		return String.format("%d20 %s", this.publicationId, this.publicationName);
	}
}
