package by.home.sorting.forBook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.SortingFocusTraversalPolicy;

import by.home.BSMAnager.DateManager;
import by.home.BSMAnager.Manager;
import by.home.bookStore.Book;

public class OtherSorting {
	
	public static ArrayList<Book> sortOldBooks(ArrayList<Book> old){
		
		for(Book temp : old){
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			Date dateFromBook = null;
			Date dateNow = DateManager.setDate();
			try {
				dateFromBook = format.parse(temp.getDate());
		      } catch (Exception e) {
		          e.printStackTrace();
		      }
			long difference = dateNow.getTime() - dateFromBook.getTime();
			int days =  (int)(difference / (24 * 60 * 60 * 1000));
			if(days > 180){
				Manager.oldBooks.add(temp);
			}
		}
		return Manager.oldBooks;
	}
	

}
