package com.revati;

import com.revati.example.Animal;
import com.revati.example.Bird;
import com.revati.example.Dog;
import com.revati.example.Fish;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Animal animal;
		
		animal = new Fish();
		animal.move();
		
		animal = new Dog();
		animal.move();
		
		animal = new Bird();
		animal.move();

	}

}
