package fileH;

import java.io.*;

public class BufferSt {
public static void main(String[] args) {
	BufferedOutputStream bos=null;
	String fname="Text.txt";
	File f=new File(fname);
	
	try {
		if(f.exists()) {
			bos=new BufferedOutputStream(new FileOutputStream(f,true));
		}else {
			bos=new BufferedOutputStream(new FileOutputStream(f));
		}
		
	}catch(IOException var27)
	{
		System.out.println(var27.getMessage());
	}
}
}
