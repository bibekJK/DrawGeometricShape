package com.draw.geometricshape.domain;

import org.springframework.stereotype.Component;

@Component
public class UserInputs {
	private String height;
	private String breadth;
	private String row;
	private String text;
	private String shape;

	public UserInputs() {
	};

	// For Rectangle
	/*public UserInputs(int height, int breadth, int row, String text, String shape) {
		super();
		this.height = height;
		this.breadth = breadth;
		this.row = row;
		this.text = text;
		this.shape = shape;
	}
*/
	// Rest others
	/*public UserInputs(int height, int row, String text, String shape) {
		super();
		this.height = height;
		this.row = row;
		this.text = text;
		this.shape = shape;
	}*/

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
