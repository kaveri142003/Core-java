package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir_path = "D:\\Java-Folder\\";
		String file_name = "Rushi.txt";
		System.out.println(dir_path+file_name);
		
		try {
			BufferedReader buffer_reader = new BufferedReader(new FileReader(new File(dir_path+file_name)));
			String data = buffer_reader.readLine();
			
			while (data!= null) {
				System.out.println(data);
				data = buffer_reader.readLine();
			}
			buffer_reader.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
