package by.home.bookSorting;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComparatorByState implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		return Boolean.compare(b2.isState(),b1.isState());
	}

}
