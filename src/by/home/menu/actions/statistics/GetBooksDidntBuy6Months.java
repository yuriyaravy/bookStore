package by.home.Menu.actions.statistics;

import by.home.BSMAnager.Manager;
import by.home.Menu.IAction;
import by.home.sorting.forBook.OtherSorting;

public class GetBooksDidntBuy6Months implements IAction{

	@Override
	public void execute() {
		System.out.println(OtherSorting.sortOldBooks(Manager.books));
		System.out.println(OtherSorting.sortOldBooks(Manager.storage));
	}

}
