package com.draw.geometricshape.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyContext {
	private Idraw draw;

	public StrategyContext getStrategyContext(Idraw iDraw) {
		this.draw = iDraw;
		return this;
	}

	public void draw() {
		draw.draw();
	}

}
