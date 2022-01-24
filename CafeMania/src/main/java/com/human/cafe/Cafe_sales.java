package com.human.cafe;

public class Cafe_sales {
	String mobile;
	String name;
	int qty;
	int price;
	String sold_time;
	
	public Cafe_sales() {
		super();
	}
	public Cafe_sales(String mobile, String name, int qty, int price, String sold_time) {
		super();
		this.mobile = mobile;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.sold_time = sold_time;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSold_time() {
		return sold_time;
	}
	public void setSold_time(String sold_time) {
		this.sold_time = sold_time;
	}
}
