package com.revati;
import java.util.List;
import java.util.Arrays;

public class MainApp 
{

	public static void main(String[] args) 
	{
		List colors = Arrays.asList("Red", "Green", "Orange", "Blue", "Yellow");
					
		System.out.println("Colors List = " + colors);
					
					
		colors.clear();
		System.out.println("Colors List = " + colors);
	
	}

}
