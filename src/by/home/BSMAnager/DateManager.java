package by.home.BSMAnager;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateManager {
	
	public static Date setDate(){	
		GregorianCalendar gc = new GregorianCalendar();
		return gc.getTime();
	}

}
