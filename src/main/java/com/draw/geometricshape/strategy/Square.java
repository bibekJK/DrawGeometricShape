package com.draw.geometricshape.strategy;

import java.util.ArrayList;
import java.util.List;

import com.draw.geometricshape.domain.UserInputs;

public class Square implements Idraw {

	@Override
	public String draw(UserInputs userInputs) {
		StringBuilder result=new StringBuilder();
		
		int height = Integer.parseInt(userInputs.getHeight());
		int row = Integer.parseInt(userInputs.getRow());
		String text = userInputs.getText();
		for (int i = 0; i < height; i++) {
			if (i == row) {
				int temp = height - text.length();
				for (int k = 0; k < height; k++) {

					if (k == temp / 2) {
						//System.out.print(text);
						result.append(text);
						k += text.length() - 1;
					} else {
						//System.out.print("*");
						result.append("*");
					}
				}
			} else {
				for (int j = 0; j < height; j++) {
					//System.out.print("*");
					result.append("*");
				}
			}
			//System.out.println();
			result.append("<br>");
		}
		return result.toString();
	}

}
