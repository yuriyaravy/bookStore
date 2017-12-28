package by.home.Menu.actions.manager;

import by.home.BSMAnager.BookManager;
import by.home.Menu.IAction;

public class AddNewBook implements IAction{

	@Override
	public void execute() {
		BookManager.addNewBook();
		
	}

}
