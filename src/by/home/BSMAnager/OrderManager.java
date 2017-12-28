package by.home.BSMAnager;


import java.util.Iterator;

import by.home.InOutputStreams.TextLogger;
import by.home.bookStore.Book;

public class OrderManager {
	
	public static void addBookToOrder(int id, String nameOfBook, String autor, double price){
		try{
			Book newBook = new Book(id, nameOfBook, autor, price);
			Manager.orderBooks.add(newBook);
		}catch(Exception ex){
			TextLogger.exceptLog(ex);
		}
	}
	
	public static void deleteBookToOrder(int id){
		try{
			Iterator<Book> ite = Manager.orderBooks.iterator();
			while(ite.hasNext()){
				Book temp = ite.next();
				if(temp.getId() == id){
					ite.remove();
				}
			}
		}catch(Exception ex){
			TextLogger.exceptLog(ex);
		}
	}
	
	
	
	
}


