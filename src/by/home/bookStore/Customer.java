package by.home.bookStore;

import java.util.ArrayList;

public class Customer {
	
	private int customerId;
	private String name;
	
	public static ArrayList<Book> customerBasket = new ArrayList<Book>();
	
	

	public Customer() {
		super();
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
