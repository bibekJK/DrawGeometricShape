package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;


public class Diamond extends UserInputs implements Idraw {
	public Diamond(int height, int row, String text, String shape) {
		super(height, row, text, shape);
	}

	@Override
	public void draw() {
		System.out.println(this.getText());

	}

}
