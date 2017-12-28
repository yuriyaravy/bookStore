package by.home.Menu;

import by.home.BSMAnager.Manager;
import by.home.bookStore.Main;

public class MainBookMenu {

	public static void main(String[] args) {
		Main.booklist();
		Main.custlist();
//		System.out.println(Manager.books);
		MenuController mc = new MenuController();
		mc.run();

	}
}
