package by.home.sorting.forBook;

import java.util.Comparator;

import by.home.bookStore.Book;

public class ComparatorForBookByYearOfPublic implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		return ((Book)o1).getYearOfPublication() - ((Book)o2).getYearOfPublication();
	}
	
}
