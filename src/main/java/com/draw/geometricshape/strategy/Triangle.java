package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;


public class Triangle extends UserInputs implements Idraw {

	public Triangle(int height, int row, String text, String shape) {
		super(height, row, text, shape);
	}

	@Override
	public void draw() {
		System.out.println(this.getText());
	}

}
