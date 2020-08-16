package com.Iooperations;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOptputStreamEx {

	public static void main(String[] args) throws IOException {
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file.txt"));
			String str = "welcome to jaba:::";
			byte[] b = str.getBytes();
			bos.write(b);
			bos.flush();
			System.out.println("sucess:");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("file.txt"));
		

	}

}
