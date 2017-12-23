package by.home.sorting.forBook;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComparatorForBookByDate implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
}
