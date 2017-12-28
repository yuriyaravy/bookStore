package by.home.Menu.instruments;

import java.util.ArrayList;

import by.home.Menu.MenuItem;

public class PrintersForMenu {
	
	public static void show(String message) {
		System.out.println(message);
	}

	public static void show(ArrayList<String> list) {
		for (String string : list) {
			show(string);
		}
	}
	
	public static void showMenu(ArrayList<MenuItem> items) {
		for (int i = 0; i < items.size(); i++) {
			show((i) + "- " + items.get(i).getTitle());
		}
	}
}
