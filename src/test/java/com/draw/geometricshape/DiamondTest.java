package com.draw.geometricshape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.draw.geometricshape.domain.UserInputs;
import com.draw.geometricshape.strategy.Diamond;

public class DiamondTest {
	Diamond diamond;
	UserInputs userInputs;

	@Before
	public void setUp() {
		diamond = new Diamond();
		userInputs = new UserInputs();

	}

	@Test
	public void drawMethodTestForNull() {
		userInputs.setHeight("10");
		userInputs.setRow("5");
		userInputs.setText("s");
		assertNotNull(diamond.draw(userInputs));
	}

	@Test
	public void drawMethodTestForInvalidInputs() {
		userInputs.setHeight("10");
		userInputs.setRow("11");
		userInputs.setText("s");
		assertEquals("Not a valid input", diamond.draw(userInputs));

		userInputs.setHeight("10");
		userInputs.setRow("1");
		userInputs.setText("test");
		assertEquals("Not a valid input", diamond.draw(userInputs));
	}

	@Test
	public void drawMethodTestValidInputs() {
		userInputs.setHeight("10");
		userInputs.setRow("5");
		userInputs.setText("four");
		assertEquals(296, diamond.draw(userInputs).length());

		userInputs.setHeight("4");
		userInputs.setRow("3");
		userInputs.setText("tw");
		assertEquals("&nbsp;&nbsp;* <br>&nbsp;* * <br>* t w <br>&nbsp;* * <br>&nbsp;&nbsp;* <br>",
				diamond.draw(userInputs));

	}

}
