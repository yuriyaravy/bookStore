package by.home.Menu;


import by.home.Menu.actions.comparator.*;
import by.home.Menu.actions.customer.*;
import by.home.Menu.actions.manager.*;
import by.home.Menu.actions.statistics.*;
import by.home.Menu.instruments.MenuState;

public class Builder {
	
	
	private Menu mainMenu = new Menu();
	private Menu custMenu = new Menu();
	private Menu manageMenu = new Menu();
	private Menu insideMenu = new Menu();
	private Menu managerBook = new Menu();
	private Menu managerStorage = new Menu();
	private Menu managerStat = new Menu();
	private Menu sorters = new Menu();
	
	public Menu buildMenu(){
		
		managerBook.addMenu(new MenuItem("Add new book", new AddNewBook()));
		managerBook.addMenu(new MenuItem("Add new order", new AddNewOrder()));
		managerBook.addMenu(new MenuItem("Remove order", new DeleteBookFromOrder()));
		
		managerStorage.addMenu(new MenuItem("Add book in storage",new AddBookToStorage()));
		managerStorage.addMenu(new MenuItem("Delete book from storage",new DeleteBookFromStorage()));
		
		managerStat.addMenu(new MenuItem("Profit from sold books",new GetProfitFromSoldBooks()));
		managerStat.addMenu(new MenuItem("Quantity sold books",new GetCountOfOrder()));
		managerStat.addMenu(new MenuItem("This books didn't buy more than 6 months", new GetBooksDidntBuy6Months()));
		
		manageMenu.addMenu(new MenuItem("Books", managerBook));
		manageMenu.addMenu(new MenuItem("Storage", managerStorage));
		manageMenu.addMenu(new MenuItem("Statistic", managerStat));
		
		insideMenu.addMenu(new MenuItem("Add new book in basket", new AddBooksInBasket()));
		insideMenu.addMenu(new MenuItem("Remove book from basket",new RemoveBookFromBasket()));
		insideMenu.addMenu(new MenuItem("Do you want see your basket",new CheckBasket()));
		
		custMenu.addMenu(new MenuItem("New Customer", new AddNewCustomer(), insideMenu));
		custMenu.addMenu(new MenuItem("I have Account",new  SearchCustomer(), insideMenu));
		
		sorters.addMenu(new MenuItem("Sort books by price ", new SortByPrice()));
		sorters.addMenu(new MenuItem("Sort books by date ", new SortByDate()));
		sorters.addMenu(new MenuItem("Sort books by year of publication ", new SortByPublicYear()));
		sorters.addMenu(new MenuItem("Sort books by status ", new SortByStatus()));
		
		mainMenu.addMenu(new MenuItem("Customer", custMenu));
		mainMenu.addMenu(new MenuItem("Manager", manageMenu));
		mainMenu.addMenu(new MenuItem("Search books", sorters));
		
		return mainMenu;
	}
	
	public Menu getRootMenu(){
		return this.mainMenu;
		
	}
}
