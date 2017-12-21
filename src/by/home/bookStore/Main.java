package by.home.bookStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import by.home.BSMAnager.Manager;
import by.home.bookSorting.ComparatorByState;
import by.home.bookSorting.ComporatorByPrice;
import by.home.bookSorting.ComporatorByYearOfPublic;

public class Main {
	public static void main(String[] args) {
		
		Book b1 = new Book("Azbyka", "Puskin", 245, 2006, false);
		Book b2 = new Book("Gore ot yma", "Griboedov", 235, 1824, true);
		Book b3 = new Book("Master i margarita", "Bylgakov", 305, 1937, true);
		Book b4 = new Book("Voina i mir", "Tolstoi", 600, 1869, true);
		Book b5 = new Book("Idiot", "Dostoevskii", 250.0, 1868 , false);
		
		Manager s1 = new Manager();
		s1.addBook(b1);
		s1.addBook(b2);
		s1.addBook(b3);
		s1.addBook(b4);
		s1.addBook(b5);
		
		for(Book temp : (s1.books)){
			System.out.println(temp);
		}
			
		System.out.println();
		Collections.sort(s1.books);
		for(Book temp : (s1.books)){
			System.out.println(temp);
		}
		System.out.println();
		Collections.sort(s1.books, new ComporatorByYearOfPublic());
		for(Book temp : (s1.books)){
			System.out.println(temp);
		}
		System.out.println();
		Collections.sort(s1.books, new ComporatorByPrice());
		for(Book temp : (s1.books)){
			System.out.println(temp);
		}
		
		System.out.println();
		Collections.sort(s1.books, new ComparatorByState());
		for(Book temp : (s1.books)){
			System.out.println(temp);
		}
		
		OrderBook or1 = new OrderBook("BloodAndSand", 200);
		OrderBook or2 = new OrderBook("11Minuts", 150);
		OrderBook or3 = new OrderBook("Gerkules", 210);
		OrderBook or4 = new OrderBook("OldManAndSee", 170);
		
		Manager m1 = new Manager();
		m1.addBookOrder(or1);
		m1.addBookOrder(or2);
		m1.addBookOrder(or3);
		m1.addBookOrder(or4);
		System.out.println(or1.status);
		System.out.println(or1.executionDate);
		or1.delivered();
		System.out.println();
		System.out.println(or1.status);
		System.out.println(or1.executionDate);
		System.out.println(m1.orderBooks);
		
		System.out.println();
//		Collections.sort(m1.orderBooks, new ComparatorByState());
//		for(Book temp : (s1.books)){
//			System.out.println(temp);
//		}
		
		
		
		
		
		
		
		
	}
	/*
	public static ArrayList<Book> arrList(){
		ArrayList<Book> mainBooks = new ArrayList<Book>();
		return mainBooks;
	}
	*/
}
