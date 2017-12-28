package by.home.bookStore;

import java.util.Collections;

import by.home.BSMAnager.Manager;
import by.home.sorting.forBook.ComparatorForBookByPrice;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		booklist();
		custlist();
	//	CustomerManager.addNewCustomer();
	//	for(Customer temp : Manager.customerList){
	//		System.out.println(temp);
	//	}
	//	Scanner sc = new Scanner(System.in);
	//	int a = sc.nextInt();
	//	CustomerManager.aboutBook(a);
	//	InsideCustomerMenu.actionInsideCustomerMenu(1);
		
		
		Collections.sort(Manager.soldBooks, new ComparatorForBookByPrice());
		for(Book temp : (Manager.soldBooks)){
			System.out.println(temp);
		}
	/*	
		InputMismatchException
		
		
		CustomerManager.addBookInBasket(1);
		System.out.println(Customer.customerBasket);
		System.out.println(Manager.books);
		CustomerManager.aboutBook(5);
		System.out.println(Customer.customerBasket);
		System.out.println(Manager.books);
		
		StorageManager.addBookToStorage(2);
		CustomerManager.addBookInBasket(1);
		System.out.println("В магазине " +Manager.books);
		System.out.println("в карзине у клиента "+Customer.customerBasket);
		System.out.println("Склад " + Manager.storage);
		StorageManager.deleteteBookFromStorage(2);
		System.out.println("Склад " + Manager.storage);
		OrderManager.addBookToOrder(11, "Bartenders", "Myhamedov", 700);
		System.out.println(Manager.orderBooks);
		CustomerManager.sendBookToCustomer();
		System.out.println("в карзине у клиента "+Customer.customerBasket);
		System.out.println("заказы " + Manager.orderBooks);
		OrderManager.deleteBookToOrder(5);
		System.out.println("заказы " + Manager.orderBooks);
		*/
		/*
		Collections.sort(Manager.books, new ComparatorForBookByDate());
		for(Book temp : (Manager.books)){
			System.out.println(temp);
		}
		*/
		
	}
	
	public static void booklist(){
		Manager.books.add(new Book(1, "Azbyka", "SmartOne", 245, 2006, false , "01.12.2017"));
		Manager.books.add(new Book(2, "Gore ot yma", "Griboedov", 235, 1824, true, "13.10.2017"));
		Manager.books.add(new Book(3, "Master i margarita", "Bylgakov", 305, 1937, true, "23.12.2014"));
		Manager.books.add(new Book(4, "Voina i mir", "Tolstoi", 600, 1869, true, "05.12.2007"));
		Manager.books.add(new Book(5, "Idiot", "Dostoevskii", 250.0, 1868 , false, "15.02.2017"));
		Manager.requests.add(new Book(6 , "Coloring book", "Somebody", 100 , 2015, true, "23.10.2017"));
		Manager.requests.add(new Book(7 , "ABC", "MisterEnglish", 149 , 2000 , false, "13.03.2017"));
		Manager.soldBooks.add(new Book(8, "Romeo and Juliet", "Shekspir", 505 , 1597, false, "23.12.2000"));
		Manager.soldBooks.add(new Book(9, "Don Quixote","Cervantes ", 750 , 1875, false, "23.12.2007"));
		Manager.soldBooks.add(new Book(10, "Game of Thrones", "Martin", 625 , 1997, false, "01.11.2011"));
		Manager.orderBooks.add(new Book(4, "Voina i mir", "Tolstoi", 600, 1869, true, "04.09.2010"));
		Manager.orderBooks.add(new Book(5, "Idiot", "Dostoevskii", 250.0, 1868 , false, "15.07.2017"));
		Manager.orderBooks.add(new Book(6 , "Coloring book", "Somebody", 100 , 2015, true, "18.12.2013"));
	}
	public static void custlist(){
		Manager.customerList.add(new Customer(6, "Ira"));
		Manager.customerList.add(new Customer(3, "Ania"));
		Manager.customerList.add(new Customer(2, "Vlada"));
		
	}
}
