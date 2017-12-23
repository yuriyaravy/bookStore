package by.home.bookStore;

import java.util.Date;

import by.home.BSMAnager.DateManager;

public class Book implements Comparable<Book>{
	
	private int bookId;
	private String name;
	private String genre; 
	private String autor;
	private double price;
	private boolean status = false;
	private int yearOfPublication;
	private String date;
	
	
	public Book() {
		super();
	}
	
	public Book(int bookId, String name, String autor, double price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.autor = autor;
		this.price = price;
	}

	public Book(int bookId, String name, String autor, double price, int yearOfPublication, boolean status , String date) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.status = status;
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
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
	
	public long getId() {
		return bookId;
	}

	public void setId(int bookId) {
		this.bookId = bookId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [bookId= " + bookId + ", name= " + name + ", autor= " + autor + ", price= " + price + ", status= "
				+ status + ", yearOfPublication= " + yearOfPublication + ", Date= " + date + "]";
	}

	//delault sorting for all books
	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(((Book)o).name);
	}
	
	
}
