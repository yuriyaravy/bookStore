package by.home.Menu.actions.manager;

import by.home.BSMAnager.Manager;
import by.home.BSMAnager.OrderManager;
import by.home.bookStore.Book;
import by.home.Menu.IAction;
import by.home.Menu.instruments.Scanners;

public class DeleteBookFromOrder implements IAction{

	@Override
	public void execute() {
		for(Book temp : Manager.orderBooks){
			System.out.println(temp);
		}
		System.out.println("Write id for remove: ");
		OrderManager.deleteBookToOrder(Scanners.scannerForInteger());
		
	}

}
