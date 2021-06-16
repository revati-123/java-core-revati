package com.revati.child;

import com.revati.parent.Employee;

public class Tester extends Employee{

	@Override
	public void completeJob(String msg) 
	{
		System.out.println("Employee is now Tester. " + msg);
	}

}
