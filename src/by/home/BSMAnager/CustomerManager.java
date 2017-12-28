package by.home.BSMAnager;

import java.util.Iterator;
import java.util.Scanner;

import by.home.InOutputStreams.TextLogger;
import by.home.bookStore.Book;
import by.home.bookStore.Customer;

public class CustomerManager {
		
		public static void addBookInBasket(int id , Customer cust){
			try{
				Iterator<Book> ite = Manager.books.iterator();
				while(ite.hasNext()){
					Book temp = ite.next();
					if(temp.getId() == id){
						ite.remove();
						cust.customerBasket.add(temp);
					}
				}
			}catch(Exception ex){
				TextLogger.exceptLog(ex);
			}
		}
		
		public static void deleteBookInBasket(int id, Customer cust){
			try{
				Iterator<Book> ite = cust.customerBasket.iterator();
				while(ite.hasNext()){
					Book temp = ite.next();
					if(temp.getId() == id){
						cust.customerBasket.remove(temp);
					}
				}
			}catch(Exception ex){
				TextLogger.exceptLog(ex);
			}
		}
		
		public static void sendBookToCustomer(){
			try{
				Customer cust = new Customer();
				for(int i = 0; cust.customerBasket.size() != 0; i++){
					cust.customerBasket.remove(i);
				}
			}catch(Exception ex){
				TextLogger.exceptLog(ex);
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
		
		public static void addNewCustomer(){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Your full name pls");
				String name =  sc.nextLine();
				Manager.customerList.add(new Customer(name));
			}catch(Exception ex){
				TextLogger.exceptLog(ex);
			}
		}

		public static Customer searchCustomAccount() {
			Customer customer=null;
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Your name: ");
				String name = sc.nextLine();
				for(Customer temp : Manager.customerList){
					if(temp.getName().equals(name)){
						customer = temp;
						return temp;
					}
				}
			}catch(Exception ex){
				TextLogger.exceptLog(ex);
			}
			return customer;
		}
		
		
}
