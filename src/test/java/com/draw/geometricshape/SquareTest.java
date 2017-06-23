package com.draw.geometricshape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.draw.geometricshape.domain.UserInputs;
import com.draw.geometricshape.strategy.Square;

public class SquareTest {
	Square square;
	UserInputs userInputs;

	@Before
	public void setUp() {
		square = new Square();
		userInputs = new UserInputs();
	}

	@Test
	public void drawMethodTestForNull() {
		userInputs.setHeight("10");
		userInputs.setRow("5");
		userInputs.setText("s");
		assertNotNull(square.draw(userInputs));
	}

	@Test
	public void drawMethodTestForInvalidInputs() {
		userInputs.setHeight("10");
		userInputs.setRow("11");
		userInputs.setText("s");
		assertEquals("Not a valid input", square.draw(userInputs));

		userInputs.setHeight("10");
		userInputs.setRow("1");
		userInputs.setText("testmorethanten");
		assertEquals("Not a valid input", square.draw(userInputs));
	}

	@Test
	public void drawMethodTestValidInputs() {
		userInputs.setHeight("10");
		userInputs.setRow("5");
		userInputs.setText("four");

		assertEquals(140, square.draw(userInputs).length());

		userInputs.setHeight("4");
		userInputs.setRow("3");
		userInputs.setText("tw");

		assertEquals("****<br>****<br>****<br>*tw*<br>", square.draw(userInputs));

	}

}
