package by.home.InOutputStreams;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class TextLogger {
	
	public Logger logger;
	FileHandler fh;
	
	public TextLogger(String fileName) throws SecurityException, IOException {
		
		File f = new File(fileName);
		if(!f.exists()){
			f.createNewFile();
		}
		fh = new FileHandler(fileName, true);
		logger = Logger.getLogger("test");
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);
	}
	
	public static void exceptLog(Exception exept){
		TextLogger myLog;
		try {
			myLog = new TextLogger("e:/WorkSpace/BookStore/src/by/txtFiles/logMemory.txt");
			
			myLog.logger.setLevel(Level.FINEST);
			myLog.logger.info("Exeption: " + exept);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
