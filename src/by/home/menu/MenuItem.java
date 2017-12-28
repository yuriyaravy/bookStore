package by.home.Menu;

public class MenuItem {
	
	private String title;
	private IAction action;
	private Menu nextMenu;
	
	public MenuItem(String title) {
		this.title = title;
	}
	
	public MenuItem(String title, Menu nextMenu) {
		this.title = title;
		this.nextMenu = nextMenu;
	}

	public MenuItem(String title, IAction action) {
		this.title = title;
		this.action = action;
	}

	public MenuItem(String title, IAction action, Menu nextMenu) {
		this.title = title;
		this.action = action;
		this.nextMenu = nextMenu;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public IAction getAction() {
		return action;
	}

	public void setAction(IAction action) {
		this.action = action;
	}

	public Menu getNextMenu() {
		return nextMenu;
	}

	public void setNextMenu(Menu nextMenu) {
		this.nextMenu = nextMenu;
	}

	public void doAction(){
		action.execute();
	}

}
