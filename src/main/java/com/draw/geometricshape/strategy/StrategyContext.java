package com.draw.geometricshape.strategy;

import org.springframework.stereotype.Component;

import com.draw.geometricshape.domain.UserInputs;

/**
 * This class has methods that return instance as per the user input and call
 * the corresponding method
 * 
 * @author Bibek
 * 
 */
@Component
public class StrategyContext {
	private Idraw draw;

	public StrategyContext getStrategyContext(Idraw iDraw) {
		this.draw = iDraw;
		return this;
	}

	public String draw(UserInputs userInputs) {
		return draw.draw(userInputs);
	}

}
