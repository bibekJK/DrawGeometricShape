package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;

/**
 * This class contains draw and validate methods to draw the diamond shape as
 * per the requirement and validate input parameters
 * 
 * @author Bibek
 *
 */
public class Square implements Idraw {

	/**
	 * This method draws square shape with the given text and row
	 */
	@Override
	public String draw(UserInputs userInputs) {
		StringBuilder result = new StringBuilder();

		int height = Integer.parseInt(userInputs.getHeight());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();
		for (int i = 0; i < height; i++) {
			if (i == row) {
				int temp = height - text.length();
				for (int k = 0; k < height; k++) {

					if (k == temp / 2) {

						result.append(text);
						k += text.length() - 1;
					} else {

						result.append("*");
					}
				}
			} else {
				for (int j = 0; j < height; j++) {

					result.append("*");
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

	/**
	 * 
	 * @param height
	 * @param row
	 * @param text
	 * @return true or false validating given inputs from user
	 */
	public static boolean validate(int height, int row, String text) {
		int len = text.length();
		if (row > height) {
			return false;
		}
		return (len >= 0 && len < height);

	}

}
