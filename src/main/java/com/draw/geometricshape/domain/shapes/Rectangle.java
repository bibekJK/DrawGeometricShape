package com.draw.geometricshape.domain.shapes;

import com.draw.geometricshape.domain.interfaces.UserInput;

/**
 * This class contains draw and validate methods to draw the Rectangle shape as
 * per the requirement and validate input parameters
 * 
 * @author Bibek
 *
 */
public class Rectangle implements IGeometricShape {

	@Override
	public String draw(UserInput userInputs) {
		StringBuilder result = new StringBuilder();

		int height = Integer.parseInt(userInputs.getHeight());
		int breadth = Integer.parseInt(userInputs.getBreadth());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();
		int len = text.length();
		if (validate(height, breadth, row, text) == true) {
			for (int i = 0; i < height; i++) {
				if (i == row) {
					int temp = breadth - text.length();
					for (int k = 0; k < breadth; k++) {

						if (k == temp / 2) {

							for (int p = 0; p < len; p++) {

								result.append(text.charAt(p) + " ");
							}
							k += text.length() - 1;
						} else {

							result.append("* ");
						}
					}
				} else {
					for (int j = 0; j < breadth; j++) {

						result.append("* ");
					}
				}

				result.append("<br>");
			}

		} else {
			return "Not a valid input";
		}
		return result.toString();
	}

	/**
	 * 
	 * @param height
	 * @param breadth
	 * @param row
	 * @param text
	 * @return true or false validating given inputs from user
	 */
	private boolean validate(int height, int breadth, int row, String text) {
		int len = text.length();
		return !(len > breadth || breadth < 0 || height < 0 || row > height);
	}
}
