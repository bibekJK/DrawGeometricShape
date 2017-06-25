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
public class SquareTest {
	private Square classUnderTest;
	private UserInput userInputMock;

	@Before
	public void setUp() {
		classUnderTest = new Square();

		userInputMock = Mockito.mock(UserInput.class);
		Mockito.when(userInputMock.getHeight()).thenReturn("10");
		Mockito.when(userInputMock.getRow()).thenReturn("11");
		Mockito.when(userInputMock.getText()).thenReturn("sabin");

	}

	@Test
	public void drawGivenInvalidInputReturnsNotAValidInput() {

		assertEquals("Not a valid input", classUnderTest.draw(userInputMock));

		Mockito.when(userInputMock.getHeight()).thenReturn("3");
		assertEquals("Not a valid input", classUnderTest.draw(userInputMock));

	}

	@Test
	public void drawGivenValidInputReturnsStringEquivalentShape() {
		Mockito.when(userInputMock.getHeight()).thenReturn("10");
		Mockito.when(userInputMock.getRow()).thenReturn("5");
		Mockito.when(userInputMock.getText()).thenReturn("four");

		assertEquals(240, classUnderTest.draw(userInputMock).length());

		assertEquals(10, classUnderTest.draw(userInputMock).split("<br>").length);

	}
}
