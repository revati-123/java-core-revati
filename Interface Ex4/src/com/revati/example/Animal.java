package com.revati.example;

public class Animal implements Bird, Fish
{

	@Override
	public void move() 
	{
		System.out.println("bird and Fish Common implementation by Animal Class");
	}

}