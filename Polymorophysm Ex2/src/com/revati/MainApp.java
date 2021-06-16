package com.revati;

import com.revati.child.Circle;
import com.revati.child.Square;
import com.revati.child.Triangle;
import com.revati.parent.Shape;

public class MainApp {

	public static void main(String[] args) 
	{

			Shape shape;
				
			shape = new Shape();
			shape.calculateArea();
				
			shape = new Circle();
			shape.calculateArea();
				
			shape = new Triangle();
			shape.calculateArea();
				
			shape = new Square();
			shape.calculateArea();
				
		}

	

}
