package by.home.Menu.instruments;

import by.home.BSMAnager.CustomerManager;
import by.home.BSMAnager.Manager;
import by.home.bookStore.Book;
import by.home.bookStore.Customer;

public class InsideCustomerMenu {
	
	private static Customer customerNow;

	public void runInsideCustomerMenu(Customer customer) {
		this.customerNow = customer;
		headerICM();
		printInsideCustomerMenu();
		actionInsideCustomerMenu(Choice.getInput());
	}

	private static void headerICM() {
		System.out.println("\t Hello!!! "+ (customerNow.getName()));
	}

	private static void printInsideCustomerMenu() {
		System.out.println("1 - Add new book in basket");
		System.out.println("2 - Remove book from basket");
		System.out.println("3 - Do you want see your basket");
	}

	public static void actionInsideCustomerMenu(int input) {
		switch(input){
			case 1:
				for(Book temp : Manager.books){
					System.out.println(temp);
				}
				System.out.println("Write id of book for add this book in basket: ");
				CustomerManager.addBookInBasket(Scanners.scannerForInteger(), customerNow);
				break;
			case 2:
				System.out.println(customerNow.customerBasket);
				System.out.println("Write id of book for remove book from basket: ");
				CustomerManager.deleteBookInBasket(Scanners.scannerForInteger(), customerNow);
				break;
			case 3:
				for(Book temp : customerNow.customerBasket){
					System.out.println(temp);
				}
				break;
			default:
				InsideCustomerMenu ICM = new InsideCustomerMenu();
				System.out.println("Something wrong !!!");
				ICM.runInsideCustomerMenu(customerNow);
				break;
		}
		
	}
	


}
