package com.revati;

import com.revati.Classes.Artist;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Artist a1 = new Artist();
		a1.createnewArtist();
		
		Artist a2 = new Artist();
		a2.createnewArtist();
		
		Artist a3 = new Artist();
		a3.createnewArtist();
		
		Artist a4 = new Artist();
		a4.createnewArtist();
		
		Artist a5 = new Artist();
		a5.createnewArtist();
		
		Object []records = save(a1,a2,a3,a4,a5);
		
		findDuplicates(records);
	}
	
	public static void findDuplicates(Object []data)
	{
		for(int i=0; i<data.length; i++)
		{
			int cnt = 0;
			Artist first = (Artist)data[0];
			for(int j=1;j<data.length;j++)
			{
				Artist second = (Artist)data[j];
				
				if(first.artistId==second.artistId && first.artistName.equals(second.artistName))
				{
					cnt++;
				}
			}
			if(cnt>=1)
				System.out.println(" " + first.artistName + "repeated");
		}
	}
	public static Object[] save(Artist obj1, Artist obj2, Artist obj3, Artist obj4, Artist obj5)
	{
		Object []data = {obj1, obj2, obj3, obj4, obj5};
		return data;
	}
}
