package com.revati;

import com.revati.example.Animal;
import com.revati.example.Bird;
import com.revati.example.Fish;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Fish f = new Animal();
		f.move();
		
		Bird b = new Animal();
		b.move();

	}

}
