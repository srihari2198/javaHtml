package javaAssign.Task2;

public class Product {

	private double price = 5.0;

	public double getPrice() {
		return price;
	}
	
	public double getPrice(int q) {
		return q * this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
