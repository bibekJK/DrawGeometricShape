package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;

/**
 * This class contains draw and validate methods to draw the Rectangle shape as
 * per the requirement and validate input parameters
 * 
 * @author Bibek
 *
 */
public class Rectangle implements Idraw {

	@Override
	public String draw(UserInputs userInputs) {
		StringBuilder result = new StringBuilder();

		int height = Integer.parseInt(userInputs.getHeight());
		int breadth = Integer.parseInt(userInputs.getBreadth());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();
		for (int i = 0; i < height; i++) {
			if (i == row) {
				int temp = breadth - text.length();
				for (int k = 0; k < breadth; k++) {

					if (k == temp / 2) {

						result.append(text);
						k += text.length() - 1;
					} else {

						result.append("*");
					}
				}
			} else {
				for (int j = 0; j < breadth; j++) {

					result.append("*");
				}
			}

			result.append("<br>");
		}
		if (validate(height, breadth, row, text) == true) {
			return result.toString();
		} else {
			return "Not a valid input";
		}
	}

	/**
	 * 
	 * @param height
	 * @param breadth
	 * @param row
	 * @param text
	 * @return true or false validating given inputs from user
	 */
	public static boolean validate(int height, int breadth, int row, String text) {
		int len = text.length();
		if (len > breadth || breadth < 0 || height < 0 || row > height) {
			return false;
		} else {
			return true;

		}
	}
}
