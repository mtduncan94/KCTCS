package com.decorator.example;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.setDescription("House Blend Coffee, ");
	}

	@Override
	public double cost() {
		return .89;
	}

}
