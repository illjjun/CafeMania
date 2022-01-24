package com.human.cafe;

public class Sales {
	String name;
	int total;
	
	public Sales() {
	}
	public Sales(String name, int total) {
		this.name = name;
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
