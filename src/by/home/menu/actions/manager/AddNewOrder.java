package by.home.Menu.actions.manager;

import by.home.BSMAnager.OrderManager;
import by.home.Menu.IAction;
import by.home.Menu.instruments.Scanners;

public class AddNewOrder implements IAction{

	@Override
	public void execute() {
		System.out.println("Write id");
		int idBook = Scanners.scannerForInteger();
		System.out.println("Write nameOfBook");
		String nameBook = Scanners.scannerForString();
		System.out.println("Write autor");
		String autorBook = Scanners.scannerForString();
		System.out.println("Write price");
		double priceBook = Scanners.scannerForInteger();
		OrderManager.addBookToOrder(idBook, nameBook, autorBook, priceBook);
	}

}
