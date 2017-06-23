package com.draw.geometricshape.strategy;

import com.draw.geometricshape.domain.UserInputs;

/**
 * This class contains draw and validate methods to draw the diamond shape as
 * per the requirement and validate input parameters
 * 
 * @author Bibek
 *
 */
public class Diamond implements Idraw {

	/**
	 * This method draws diamond shape with the given text and row
	 */
	@Override
	public String draw(UserInputs userInputs) {
		StringBuilder result = new StringBuilder();

		int height = Integer.parseInt(userInputs.getHeight());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();

		int input = height / 2;

		int spac = input - 1;
		int min = 1;
		int count = 1;
		for (int i = 0; i < input; i++) {
			for (int k = spac; k > i; k--) {
				result.append("&nbsp;");
			}

			if (row == count) {
				result.append("* ");
				for (int j = 0; j < text.length(); j++) {
					String temp = text.charAt(j) + " ";
					result.append(temp);
				}
				for (int j = text.length(); j < i; j++) {
					result.append("* ");

				}
			} else {
				for (int j = 0; j < min; j++) {
					result.append("* ");
				}
			}

			min += 1;
			result.append("<br>");
			count++;
		}
		for (int m = input - 1; m > 0; m--) {
			for (int n = spac; n >= m; n--) {
				result.append("&nbsp;");
			}
			if (count == row) {
				result.append("* ");
				for (int q = 0; q < text.length(); q++) {
					String temp = text.charAt(q) + " ";
					result.append(temp);
				}
				for (int q = text.length(); q < m - 1; q++) {
					result.append("* ");
				}
			} else {
				for (int q = 0; q < m; q++) {
					result.append("* ");
				}
			}

			result.append("<br>");
			count++;
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
		if (len < 0 || row > height) {
			return false;
		}

		if (row <= height / 2 + 1) {
			if (len >= 0 && len <= row) {
				return true;
			} else {
				return false;
			}
		} else {
			if (len >= 0 && len <= len - row) {
				return true;
			} else {
				return false;
			}
		}

	}

}
