package com.draw.geometricshape.domain.interfaces;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * This class contains getters and setters method for user inputs value from
 * front view page
 * 
 * @author Bibek
 *
 */

public class UserInputs {
	@NotEmpty(message = "Height should not be empty")
	private String height;
	// @NotEmpty(message="Breadth should not be empty")
	private String breadth;
	@NotEmpty(message = "Row should not be empty")
	private String row;
	private String text;
	private String shape;

	public UserInputs() {
	};

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBreadth() {
		return breadth;
	}

	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
}
