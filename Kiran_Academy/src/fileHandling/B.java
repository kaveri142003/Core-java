package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir_path = "D:\\Java-Folder\\";
		String file_name = "Rushi.txt";
		System.out.println(dir_path+file_name);
		
		try {
			File file = new File(dir_path+file_name);
			FileWriter writer = new FileWriter(file,true);
			BufferedWriter buffer_writer = new BufferedWriter(writer);
			
			String data = "I like Rohit Sharma";
			buffer_writer.newLine();
			buffer_writer.write(data);
			buffer_writer.close();
			System.out.println("Data Writing done ..");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
