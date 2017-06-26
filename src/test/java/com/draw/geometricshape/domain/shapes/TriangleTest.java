package com.draw.geometricshape.domain.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.draw.geometricshape.domain.interfaces.UserInput;

@RunWith(MockitoJUnitRunner.class)
public class TriangleTest {
	private Triangle classUnderTest;
	private UserInput userInputMock;

	@Before
	public void setUP() {
		classUnderTest = new Triangle();

		userInputMock = Mockito.mock(UserInput.class);
		Mockito.when(userInputMock.getHeight()).thenReturn("2");
		Mockito.when(userInputMock.getRow()).thenReturn("3");
		Mockito.when(userInputMock.getText()).thenReturn("TestText");

	}
	 @Test
	 public void drawGivenInvalidInputReturnsNotAValidInput() {
	
	 assertEquals("Not a valid input", classUnderTest.draw(userInputMock));
	
	 Mockito.when(userInputMock.getHeight()).thenReturn("5");
	 assertEquals("Not a valid input", classUnderTest.draw(userInputMock));
	
	 }

	@Test
	public void drawGivenValidInputReturnsStringEquivalentShape() {
		Mockito.when(userInputMock.getHeight()).thenReturn("5");
		Mockito.when(userInputMock.getRow()).thenReturn("4");
		Mockito.when(userInputMock.getText()).thenReturn("tst");

		assertEquals(140, classUnderTest.draw(userInputMock).length());

	}
}
