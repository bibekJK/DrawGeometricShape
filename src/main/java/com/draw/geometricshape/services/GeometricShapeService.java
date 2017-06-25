package com.draw.geometricshape.services;

import org.springframework.stereotype.Component;

import com.draw.geometricshape.domain.interfaces.UserInput;
import com.draw.geometricshape.domain.shapes.IGeometricShape;

/**
 * This class has methods that return instance as per the user input and call
 * the corresponding method
 * 
 * @author Bibek
 * 
 */
@Component
public class GeometricShapeService {
	private IGeometricShape shape;

	public void setShape(IGeometricShape iDraw) {
		this.shape = iDraw;

	}

	public String draw(UserInput userInputs) {
		return shape.draw(userInputs);
	}

}
