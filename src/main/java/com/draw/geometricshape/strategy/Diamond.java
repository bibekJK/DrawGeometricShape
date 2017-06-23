package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;


public class Diamond implements Idraw {

	@Override
	public String draw(UserInputs userInputs) {
		System.out.println(userInputs.getShape());
		return null;

	}

}
