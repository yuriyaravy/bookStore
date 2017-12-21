package by.home.bookSorting;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComporatorByYearOfPublic implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		return ((Book)b1).getYearOfPublication() - ((Book)b2).getYearOfPublication();
	}
}
