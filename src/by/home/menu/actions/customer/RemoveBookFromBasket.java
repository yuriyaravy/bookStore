package by.home.Menu.actions.customer;

import by.home.BSMAnager.CustomerManager;
import by.home.bookStore.Customer;
import by.home.Menu.IAction;
import by.home.Menu.instruments.Scanners;

public class RemoveBookFromBasket implements IAction{
	
	SearchCustomer cs = new SearchCustomer();
	Customer customerNow = cs.getCustomer();

	@Override
	public void execute() {
		System.out.println(customerNow.customerBasket);
		System.out.println("Write id of book for remove book from basket: ");
		CustomerManager.deleteBookInBasket(Scanners.scannerForInteger(), customerNow);
		
	}

}
