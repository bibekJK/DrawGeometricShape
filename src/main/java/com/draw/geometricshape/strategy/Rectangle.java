package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;


public class Rectangle extends UserInputs implements Idraw {

	public Rectangle(int height, int breadth, int row, String text, String shape) {
		super(height, breadth, row, text, shape);
	}

	@Override
	public void draw() {
		System.out.println(this.getText());

	}

}
