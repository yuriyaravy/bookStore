package by.home.Menu.actions.manager;

import by.home.BSMAnager.Manager;
import by.home.BSMAnager.StorageManager;
import by.home.bookStore.Book;
import by.home.Menu.IAction;
import by.home.Menu.instruments.Choice;

public class DeleteBookFromStorage implements IAction{

	@Override
	public void execute() {
		for(Book temp : Manager.storage){
			System.out.println(temp);
		}
		StorageManager.deleteteBookFromStorage(Choice.getInput());
		
	}

}
