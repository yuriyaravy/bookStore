package by.home.BSMAnager;


import java.util.Iterator;

import by.home.bookStore.Book;

public class OrderManager {
	
	public static void addBookToOrder(int id, String nameOfBook, String autor, double price){
		Book newBook = new Book(id, nameOfBook, autor, price);
		Manager.orderBooks.add(newBook);
	}
	
	public static void deleteBookToOrder(int id){
		Iterator<Book> ite = Manager.orderBooks.iterator();
		while(ite.hasNext()){
			Book temp = ite.next();
			if(temp.getId() == id){
				ite.remove();
			}
		}
	}
	
	
	
	
}


