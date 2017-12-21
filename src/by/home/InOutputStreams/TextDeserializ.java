package by.home.InOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import by.home.bookStore.Book;

public class TextDeserializ {
	
	public ArrayList<Book> textDeser(){
		ArrayList<Book> fc = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/javaProgects/bookStore/bookStore/src/by/home/textBase"));
			 fc = (ArrayList<Book>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fc;
	}
}
