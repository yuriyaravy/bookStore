package by.home.InOutputStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import by.home.bookStore.Book;

public class TextSerializ {
	
	public void textSerial(ArrayList<Book> books){
		try{
			FileOutputStream fos = new FileOutputStream("E:/javaProgects/bookStore/bookStore/src/by/home/textBase");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(books);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
