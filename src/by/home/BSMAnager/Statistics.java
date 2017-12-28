package by.home.BSMAnager;

import java.util.ArrayList;

import by.home.InOutputStreams.TextLogger;
import by.home.bookStore.Book;

public class Statistics {
	
	public static double getProfitFromSoldBooks(ArrayList<Book> soldBooks){
		double profit = 0;
		try{
			for(Book temp : soldBooks){
				profit = profit + temp.getPrice();
			}
		}catch(Exception ex){
			TextLogger.exceptLog(ex);
		}
		return profit;
	}
	public static int getCountOfOrder(ArrayList<Book> soldBooks){
		int profit = soldBooks.size();
		return profit;
	}

}
