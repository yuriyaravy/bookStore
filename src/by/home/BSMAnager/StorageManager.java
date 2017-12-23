package by.home.BSMAnager;

import java.util.Iterator;

import by.home.bookStore.Book;
//import by.home.bookStore.Customer;

public class StorageManager {
	
	public static void deleteteBookFromStorage(int id){
		Iterator<Book> ite = Manager.storage.iterator();
		while(ite.hasNext()){
			Book temp = ite.next();
			if(temp.getId() == id){
				ite.remove();
			}
		}
	}
	
	public static void addBookToStorage(int id){
		Iterator<Book> ite = Manager.books.iterator();
		while(ite.hasNext()){
			Book temp = ite.next();
			if(temp.getId() == id){
				temp.setState(true);
				ite.remove();
				Manager.storage.add(temp);
			}
		}
	}
	
	
	

}
