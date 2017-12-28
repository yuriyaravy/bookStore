package by.home.Menu.actions.statistics;

import by.home.BSMAnager.Manager;
import by.home.BSMAnager.Statistics;
import by.home.Menu.IAction;

public class GetProfitFromSoldBooks implements IAction{

	@Override
	public void execute() {
		System.out.println(Statistics.getProfitFromSoldBooks(Manager.soldBooks));
	}

}
