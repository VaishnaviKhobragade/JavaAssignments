package fileH;

import java.io.*;

public class basic {
public static void main(String[] args) {
	File f=new File("Text.txt");
	
	try {
		FileWriter fw=new FileWriter(f);
		
		fw.write("Hello, World");
		fw.write("\n Java");
		
		fw.close();
		System.out.println("Data written to file: "+f.getAbsolutePath());
	}catch(IOException e) {
		System.out.println("An error occurred while writing to file: "+e.getMessage());
	}
	
	BufferedReader reader =null;
	try {
		reader=new BufferedReader(new FileReader(f));
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	finally {
		try {
			if(reader!=null) {
				reader.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
