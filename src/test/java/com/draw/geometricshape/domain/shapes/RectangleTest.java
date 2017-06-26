package com.draw.geometricshape.domain.shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.draw.geometricshape.domain.interfaces.UserInput;

@RunWith(MockitoJUnitRunner.class)
public class RectangleTest {

	private Rectangle classUnderTest;
	private UserInput userInputMock;

	@Before
	public void setUp() {
		classUnderTest = new Rectangle();

		userInputMock = Mockito.mock(UserInput.class);

		Mockito.when(userInputMock.getHeight()).thenReturn("3");
		Mockito.when(userInputMock.getBreadth()).thenReturn("4");
		Mockito.when(userInputMock.getRow()).thenReturn("3");
		Mockito.when(userInputMock.getText()).thenReturn("TestText");
	}

	@Test
	public void drawGivenInvalidInputReturnsNotAInvalidInput() {
		assertEquals("Not a valid input", classUnderTest.draw(userInputMock));

	}

	@Test
	public void drawGivenValidInputReturnStringEquivalentShape() {
		Mockito.when(userInputMock.getHeight()).thenReturn("4");
		Mockito.when(userInputMock.getBreadth()).thenReturn("6");
		Mockito.when(userInputMock.getRow()).thenReturn("2");
		Mockito.when(userInputMock.getText()).thenReturn("Test");

		assertEquals("* * * * * * <br>* * * * * * <br>* T e s t * <br>* * * * * * <br>",
				classUnderTest.draw(userInputMock));

	}

}
