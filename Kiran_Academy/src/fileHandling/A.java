package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {
	
	public static void main(String[] args) {
		String dir_path = "D:\\Java-Folder\\";
		String file_name = "Rushi.txt";
		File file = new File(dir_path);
		file.mkdir();
		try {
			file.createNewFile();
			System.out.println("File Created !!");
			
			FileWriter writer = new FileWriter(dir_path+file_name);
			writer.write("My name is Rushikesh.");
			writer.write("I am a Java Developer.");
			writer.flush();
			writer.close();
			
			FileReader reader =  new FileReader(dir_path+file_name);
			int code =  reader.read();
			while (code!=-1) {
				char ch =  (char)(code);
				System.out.print(ch);
				code = reader.read();
			}
			reader.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
