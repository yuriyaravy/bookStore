package by.home.Menu;

import by.home.Menu.instruments.Choice;

public class MenuController {
	
	private Navigator navigator;
	private Builder builder;
	
	public void run(){
		builder = new Builder();
		builder.buildMenu();
		navigator = new Navigator (builder.getRootMenu());
		while(true){
			navigator.printMenu();
			int where = Choice.getInput();
			navigator.navigate(where-1);
			
		}
	}

}
