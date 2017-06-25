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
				System.out.print(" ");
				result.append("&nbsp;");
			}

			if (i != row) {
				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
					result.append("* ");
				}
			} else {

				if (row == len - 1) {
					for (int k = 0; k < len; k++) {
						System.out.print(text.charAt(k) + " ");
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
								System.out.print(text.charAt(k) + " ");
								result.append(text.charAt(k) + " ");
							}
						}
						if (l + len - 1 < row) {
							System.out.print("* ");
							result.append("* ");
						}
					}
				}
			}

			System.out.println();
			result.append("<br>");
		}
		// for (int i = 0; i < height; i++) {
		// for (int j = 0; j < height - i; j++) {
		//
		// result.append("&nbsp;");
		// }
		//
		// if (i != row) {
		// for (int k = 0; k <= i; k++) {
		//
		// result.append("* ");
		// }
		// } else {
		//
		// result.append("* ");
		// for (int l = 0; l < len; l++) {
		//
		// String temp = text.charAt(l) + " ";
		// result.append(temp);
		// }
		// for (int m = 0; m < row - len; m++) {
		//
		// result.append("* ");
		// }
		// }
		//
		// result.append("<br>");
		// }

		if (validate(height, row, text) == true) {
			System.out.println(validate(height, row, text));
			return result.toString();

		} else {
			return "Not a valid input";
		}

	}

	private boolean validate(int height, int row, String text) {
		int len = text.length();
		if (row > height) {
			return false;
		}

		return len - 1 <= row;

	}

}
