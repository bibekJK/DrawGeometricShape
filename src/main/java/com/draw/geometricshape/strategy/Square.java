package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;

public class Square implements Idraw {

	@Override
	public void draw(UserInputs userInputs) {
		System.out.println(userInputs.getShape());
	}

}
