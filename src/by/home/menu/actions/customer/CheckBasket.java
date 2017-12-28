package by.home.Menu.actions.customer;

import by.home.bookStore.Book;
import by.home.bookStore.Customer;
import by.home.Menu.IAction;

public class CheckBasket implements IAction {
	
	SearchCustomer cs = new SearchCustomer();
	Customer customerNow = cs.getCustomer();
	
	@Override
	public void execute() {
		for(Book temp : customerNow.customerBasket){
			System.out.println(temp);
		}
		
	}

}
