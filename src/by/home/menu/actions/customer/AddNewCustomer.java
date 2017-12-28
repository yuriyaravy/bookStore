package by.home.Menu.actions.customer;

import by.home.BSMAnager.CustomerManager;
import by.home.Menu.IAction;

public class AddNewCustomer implements IAction{

	@Override
	public void execute() {
		CustomerManager.addNewCustomer();
	}

}
