package by.home.Menu.actions.comparator;

import java.util.Collections;

import by.home.BSMAnager.Manager;
import by.home.Menu.IAction;
import by.home.bookStore.Book;
import by.home.sorting.forBook.ComparatorForBookByPrice;

public class SortByPrice implements IAction{

	@Override
	public void execute() {
		Collections.sort(Manager.books, new ComparatorForBookByPrice());
		for(Book temp : (Manager.books)){
			System.out.println(temp);
		}
		
	}

}
