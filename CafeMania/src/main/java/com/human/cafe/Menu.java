package com.human.cafe;

public class Menu {  // DTO
	private int code;
	private String name;
	private int price;
	public Menu() {
	}
	public Menu(int code, String name, int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
