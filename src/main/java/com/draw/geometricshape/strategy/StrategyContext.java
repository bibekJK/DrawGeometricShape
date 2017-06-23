package com.draw.geometricshape.strategy;

import org.springframework.stereotype.Component;

import com.draw.geometricshape.domain.UserInputs;

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