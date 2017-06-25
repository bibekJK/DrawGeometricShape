package com.draw.geometricshape.domain.shapes;

import com.draw.geometricshape.domain.interfaces.UserInputs;

/**
 * This class contains draw and validate methods to draw the Triangle shape as
 * per the requirement and validate input parameters
 * 
 * @author Bibek
 *
 */
public class Triangle implements IGeometricShape {

	@Override
	public String draw(UserInputs userInputs) {
		StringBuilder result = new StringBuilder();

		int height = Integer.parseInt(userInputs.getHeight());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();

		int len = text.length();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {

				result.append("&nbsp;");
			}

			if (i != row) {
				for (int k = 0; k <= i; k++) {

					result.append("* ");
				}
			} else {

				result.append("* ");
				for (int l = 0; l < len; l++) {

					String temp = text.charAt(l) + " ";
					result.append(temp);
				}
				for (int m = 0; m < row - len; m++) {

					result.append("* ");
				}
			}

			result.append("<br>");
		}

		if (validate(height, row, text) == true) {
			return result.toString();
		} else {
			return "Not a valid input";
		}
	}

	private boolean validate(int height, int row, String text) {
		int len = text.length();
		if (len < 0 || row > height) {
			return false;
		}

		return text.length() >= 0 && text.length() <= row;

	}

}
