package by.home.BSMAnager;

import java.util.Iterator;

import by.home.InOutputStreams.TextLogger;
import by.home.bookStore.Book;
//import by.home.bookStore.Customer;

public class StorageManager {
	// method for 
	public static void deleteteBookFromStorage(int id){
		try{
			Iterator<Book> ite = Manager.storage.iterator();
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
	
	public static void addBookToStorage(int id){
		try{
			Iterator<Book> ite = Manager.books.iterator();
			while(ite.hasNext()){
				Book temp = ite.next();
				if(temp.getId() == id){
					temp.setState(true);
					ite.remove();
					Manager.storage.add(temp);
				}
			}
		}catch(Exception ex){
			TextLogger.exceptLog(ex);
		}
	}

	
	
	

}
