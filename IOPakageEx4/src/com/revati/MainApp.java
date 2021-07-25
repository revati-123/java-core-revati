package com.revati;

import java.io.Console;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException 
	{
		//to read encrypted Characters
		Console C = System.console();
		
		System.out.print("\n Enter Password :");
		char arr[] = C.readPassword();
		
		String obj = new String(arr);
		System.out.println("Decrypted Password = " + obj);

	}
}
