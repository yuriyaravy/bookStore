package by.home.BSMAnager;

import java.util.Iterator;

import by.home.bookStore.Book;
import by.home.bookStore.Customer;

public class CustomerManager {
		
		public static void addBookInBasket(int id){
			Iterator<Book> ite = Manager.books.iterator();
			while(ite.hasNext()){
				Book temp = ite.next();
				if(temp.getId() == id){
					ite.remove();
					Customer.customerBasket.add(temp);
				}
			}
		}
		
		public static void sendBookToCustomer(){
			for(int i = 0; Customer.customerBasket.size() != 0; i++){
				Customer.customerBasket.remove(i);
			}
		}
		
		public static void aboutBook(int id){
			if(id < Manager.books.size()){
			for(Book temp : Manager.books)
				if(temp.getId() == id){
					System.out.println(temp);
				}
			}else{
				System.out.println("dont have " + id);
			}
		}
		
		
		
}
