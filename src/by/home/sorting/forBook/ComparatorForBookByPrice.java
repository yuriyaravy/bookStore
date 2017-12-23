package by.home.sorting.forBook;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComparatorForBookByPrice implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		return (int) (((Book)b1).getPrice() - ((Book)b2).getPrice());
	}

}


