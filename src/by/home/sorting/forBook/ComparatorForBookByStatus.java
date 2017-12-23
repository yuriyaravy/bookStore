package by.home.sorting.forBook;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComparatorForBookByStatus implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		return  Boolean.compare(b2.isStatus(),b1.isStatus());
	}
}


