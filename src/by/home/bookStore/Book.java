package by.home.bookStore;

import java.util.Date;

import by.home.BSMAnager.DateManager;

public class Book implements Comparable<Book>{
	
	private String name;
	private String genre; 
	private String autor;
	private double price;
	private boolean status;
	private int yearOfPublication;
	private static final Date incomingDate = DateManager.setDate();
	
	
		//for customer
	public Book(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ",  autor=" + autor + ", price=" + price + ", state=" + status
				+ "]";
	}

	public Book() {
		super();
	}

	public Book(String name, String autor, double price, int yearOfPublication, boolean state) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.status = status;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isState() {
		return status;
	}

	public void setState(boolean state) {
		this.status = state;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	//delault sorting for all books
	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(((Book)o).name);
	}
	
	
}
