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

		if (validate(height, row, text) == true) {
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

					if (row == len - 1) {
						for (int k = 0; k < len; k++) {

							result.append(text.charAt(k) + " ");
						}
					} else {
						for (int l = 0; l <= row - len + 1; l++) {
							int temp = (row - len) / 2;

							if (temp < 0) {
								temp = 0;
							}

							if (row / 2 == 0 && l == temp || row / 2 != 0 && l == temp + 1) {
								for (int k = 0; k < len; k++) {

									result.append(text.charAt(k) + " ");
								}
							}
							if (l + len - 1 < row) {

								result.append("* ");
							}
						}
					}
				}

				result.append("<br>");
			}

		} else {
			return "Not a valid input";
		}
		return result.toString();

	}

	private boolean validate(int height, int row, String text) {
		int len = text.length();
		if (row > height) {
			return false;
		}

		return len - 1 <= row;

	}

}
