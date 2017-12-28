package by.home.Menu.actions.customer;

import by.home.BSMAnager.CustomerManager;
import by.home.bookStore.Customer;
import by.home.Menu.IAction;
import by.home.Menu.instruments.InsideCustomerMenu;

public class SearchCustomer implements IAction{
	
	private Customer customer = null;
	
	private Customer custom(){
		InsideCustomerMenu ICM = new InsideCustomerMenu();
		customer = CustomerManager.searchCustomAccount();
		ICM.runInsideCustomerMenu(customer);
		return customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public void execute() {
		custom();
		if(customer != null){
			
		}
	}

}
