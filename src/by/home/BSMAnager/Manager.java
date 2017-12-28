package by.home.BSMAnager;

import java.util.ArrayList;

import by.home.bookStore.Book;
import by.home.bookStore.Customer;

public class Manager {
	
	public static ArrayList<Book> books = new ArrayList<Book>();
	public static ArrayList<Book> orderBooks = new ArrayList<Book>();
	public static ArrayList<Book> requests = new ArrayList<Book>();
	public static ArrayList<Book> soldBooks = new ArrayList<Book>();
	public static ArrayList<Book> storage = new ArrayList<Book>();
	
	//list of customer
	public static ArrayList<Customer> customerList = new ArrayList<>();
	//array for books older than 6 months
	public static ArrayList<Book> oldBooks = new ArrayList<Book>();
}
