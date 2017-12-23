package by.home.BSMAnager;

import java.util.ArrayList;

import by.home.bookStore.Book;

public class Statistics {
	
	public static double getProfitFromSoldBooks(ArrayList<Book> soldBooks){
		double profit = 0;
		for(Book temp : soldBooks){
			profit = profit + temp.getPrice();
		}
		return profit;
	}
	public static int getCountOfOrder(ArrayList<Book> soldBooks){
		int profit = soldBooks.size();
		return profit;
	}

}
