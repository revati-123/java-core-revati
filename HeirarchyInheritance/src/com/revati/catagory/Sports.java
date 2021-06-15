package com.revati.catagory;

import com.revati.product.Product;

public class Sports extends Product {
	
	protected String sportType;
	
	public Sports() {}

	public Sports(String sportType) {
		super("Sport");
		this.sportType = sportType;
	}

}
