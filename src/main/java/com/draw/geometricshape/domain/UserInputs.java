package com.draw.geometricshape.domain;

public class UserInputs {
	private int height;
	private int breadth;
	private int row;
	private String text;
	private String shape;
	
	public UserInputs(){};
	//For Rectangle
	public UserInputs(int height, int breadth, int row, String text, String shape) {
		super();
		this.height = height;
		this.breadth = breadth;
		this.row = row;
		this.text = text;
		this.shape = shape;
	}
	//Rest others
	public UserInputs(int height, int row, String text, String shape) {
		super();
		this.height = height;
		this.row = row;
		this.text = text;
		this.shape = shape;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
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
