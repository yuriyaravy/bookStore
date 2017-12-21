package by.home.BSMAnager;

import java.util.ArrayList;

import by.home.bookStore.Book;
import by.home.bookStore.OrderBook;

public class Manager {
	
	public ArrayList<Book> books = new ArrayList<Book>();
	
	public ArrayList<OrderBook> orderBooks = new ArrayList<OrderBook>();
	
	public void addBook(Book book){
		books.add(book);
	}
	
	public void addBookOrder(OrderBook orderBook){
		orderBooks.add(orderBook);
	}

}
