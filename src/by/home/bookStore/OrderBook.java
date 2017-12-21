package by.home.bookStore;

import java.util.Date;

import by.home.BSMAnager.DateManager;

public class OrderBook {
	

	private String name;
	private double price;
	public boolean status = false;
	public Date executionDate;
	
	public OrderBook(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	protected boolean delivered(){
		this.status = true;
		executionDate = DateManager.setDate();
		return status;
	}
	@Override
	public String toString() {
		return "OrderBook [name=" + name + ", price=" + price + ", status=" + status + ", Time=" + executionDate +"]";
	}
	
}
