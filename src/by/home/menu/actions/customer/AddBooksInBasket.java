package by.home.Menu.actions.customer;

import by.home.BSMAnager.CustomerManager;
import by.home.BSMAnager.Manager;
import by.home.bookStore.Book;
import by.home.bookStore.Customer;
import by.home.Menu.IAction;
import by.home.Menu.instruments.Scanners;

public class AddBooksInBasket implements IAction{
	
	@Override
	public void execute() {
		Customer customerNow = null;
		for(Book temp : Manager.books){
			System.out.println(temp);
		}
		System.out.println("Write id of book for add this book in basket: ");
		CustomerManager.addBookInBasket(Scanners.scannerForInteger(), customerNow);
	}

}
