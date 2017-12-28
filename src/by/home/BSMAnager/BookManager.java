package by.home.BSMAnager;

import java.util.Scanner;

import by.home.Menu.instruments.Scanners;
import by.home.bookStore.Book;

public class BookManager {
	
	public static void addNewBook(){
		System.out.println("Book id - ");
		int id = Scanners.scannerForInteger();
		System.out.println("Name of book - ");
		String name = Scanners.scannerForString();
		System.out.println("Autor of book - ");
		String autor = Scanners.scannerForString();
		System.out.println("Price - ");
		int price = Scanners.scannerForInteger();
		System.out.println("Year of publication - ");
		int year = Scanners.scannerForInteger();
		System.out.println("Date today - ");
		String date = Scanners.scannerForString();
		Manager.books.add(new Book(id, name, autor, price, year, date));
		System.out.println("Success ");
	}
}
